import sys
import tkinter as tk

import antlr4
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

import functions as funcs
from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammListener import TUMCADgrammListener
from gen.TUMCADgrammParser import TUMCADgrammParser

INTEGER, PLUS, MINUS, MUL, DIV, LPAREN, RPAREN, EOF, FUNC, LBPAREN, RBPAREN, CHAR, BOOLEAN, STRING, BOOL, VAR, OPERATORS, TYPE = (
    'INTEGER', 'PLUS', 'MINUS', 'MUL', 'DIV', '(', ')', 'EOF', 'FUNC', '{', '}', 'CHAR', 'BOOLEAN', 'STRING', 'BOOL', 'VAR', 'OPERATORS', 'TYPE'
)


class Token(object):
    def __init__(self, type, value):
        self.type = type
        self.value = value

    def __str__(self):
        return 'Token({type}, {value})'.format(
            type=self.type,
            value=repr(self.value)
        )

    def __repr__(self):
        return self.__str__()


class Lexer(object):
    def __init__(self, text):
        self.text = text
        self.pos = 0
        self.current_char = self.text[self.pos]

    def error(self):
        raise Exception('Invalid character')

    def advance(self):
        self.pos += 1
        if self.pos > len(self.text) - 1:
            self.current_char = None  # Indicates end of input
        else:
            self.current_char = self.text[self.pos]

    def skip_whitespace(self):
        while self.current_char is not None and self.current_char.isspace():
            self.advance()

    def integer(self):
        result = ''
        while self.current_char is not None and self.current_char.isdigit():
            result += self.current_char
            self.advance()
        return int(result)

    def char(self):
        result = ''
        while self.current_char is not None and self.current_char.ischar():
            result += self.current_char
            self.advance()
        if result[0].isupper():
            if result == "Func":
                return "MethodCall"
            else:
                if result == "Int":
                    return "INTEGER"
                if result == "Bool":
                    return "BOOLEAN"
                if result == "Double":
                    return "DOUBLE"
                if result == "False":
                    return "BOOL False"
                if result == "True":
                    return "BOOL True"
        return result

    def get_next_token(self):
        while self.current_char is not None:

            if self.current_char.isspace():
                self.skip_whitespace()
                continue

            if self.current_char.isdigit():
                return Token(INTEGER, self.integer())

            if self.current_char.isalpha():
                if self.char() == "MethodCall":
                    return Token(FUNC, "METHODCALL")
                elif self.char() == "BOOL False":
                    return Token(BOOL, "BOOL False")
                elif self.char() == "BOOL True":
                    return Token(BOOL, "BOOL True")
                elif self.char()[0].isupper():
                    return Token(TYPE, self.char())
                return Token(CHAR, self.char())

            if self.current_char == '+':
                self.advance()
                return Token(PLUS, '+')

            if self.current_char == '-':
                self.advance()
                return Token(MINUS, '-')

            if self.current_char == '*':
                self.advance()
                return Token(MUL, '*')

            if self.current_char == '/':
                self.advance()
                return Token(DIV, '/')

            if self.current_char == '(':
                self.advance()
                return Token(LPAREN, '(')

            if self.current_char == ')':
                self.advance()
                return Token(RPAREN, ')')

            if self.current_char == '{':
                self.advance()
                return Token(LBPAREN, '{')

            if self.current_char == '}':
                self.advance()
                return Token(RBPAREN, '}')

            self.error()

        return Token(EOF, None)


class AST(object):
    pass


class BinOp(AST):
    def __init__(self, left, op, right):
        self.left = left
        self.token = self.op = op
        self.right = right


class Num(AST):
    def __init__(self, token):
        self.token = token
        self.value = token.value


class Parser(object):
    def __init__(self, lexer):
        self.lexer = lexer
        self.current_token = self.lexer.get_next_token()

    def error(self):
        raise Exception('Invalid syntax')

    def eat(self, token_type):
        if self.current_token.type == token_type:
            self.current_token = self.lexer.get_next_token()
        else:
            self.error()

    def factor(self):
        token = self.current_token
        if token.type == INTEGER:
            self.eat(INTEGER)
            return Num(token)
        elif token.type == LPAREN:
            self.eat(LPAREN)
            node = self.expr()
            self.eat(RPAREN)
            return node

    def term(self):
        node = self.factor()

        while self.current_token.type in (MUL, DIV):
            token = self.current_token
            if token.type == MUL:
                self.eat(MUL)
            elif token.type == DIV:
                self.eat(DIV)

            node = BinOp(left=node, op=token, right=self.factor())

        return node

    def expr(self):
        node = self.term()

        while self.current_token.type in (PLUS, MINUS):
            token = self.current_token
            if token.type == PLUS:
                self.eat(PLUS)
            elif token.type == MINUS:
                self.eat(MINUS)

            node = BinOp(left=node, op=token, right=self.term())

        return node

    def parse(self):
        return self.expr()


class NodeVisitor(object):
    def visit(self, node):
        method_name = 'visit_' + type(node).__name__
        visitor = getattr(self, method_name, self.generic_visit)
        return visitor(node)

    def generic_visit(self, node):
        raise Exception('No visit_{} method'.format(type(node).__name__))


class Interpreter(NodeVisitor):
    def __init__(self, parser):
        self.parser = parser

    def visit_BinOp(self, node):
        if node.op.type == PLUS:
            return self.visit(node.left) + self.visit(node.right)
        elif node.op.type == MINUS:
            return self.visit(node.left) - self.visit(node.right)
        elif node.op.type == MUL:
            return self.visit(node.left) * self.visit(node.right)
        elif node.op.type == DIV:
            return self.visit(node.left) / self.visit(node.right)

    def visit_Num(self, node):
        return node.value

    def interpret(self):
        tree = self.parser.parse()
        return self.visit(tree)


class SyntaxException(Exception):
    def __repr__(self):
        return self.args[0]


class MyErrorListener(ErrorListener):

    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise SyntaxException(
            f' Syntax Error\n Line: {line} Column: {column}\n {msg}')


#    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
#        raise Exception("Oh no is an ambiguity ")

#    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
#        raise Exception(" You don't know that is a Attempting FuLL Context???")

#   def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
#        raise Exception("Is Context Sensitive")


def parse(text):
    try:
        if len(text) > 1:
            # input = FileStream(text[1])
            lexer = TUMCADgrammLexer(InputStream(text))

            stream = CommonTokenStream(lexer)
            parser = TUMCADgrammParser(stream)
            parser.addErrorListener(MyErrorListener())
            tree = parser.program()
            printer = TUMCADgrammListener()
            walker = ParseTreeWalker()

            return " Successfully compiled"
        else:
            return ' Error : Expected a valid file'
    except Exception as error:
        return repr(error)
