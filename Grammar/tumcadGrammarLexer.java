// Generated from tumcadGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tumcadGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Letter=30, Digit=31, 
		Boolean_value=32, Arithmetic_operator=33, Comparison_operator=34, Logical_operator=35, 
		Assignment_operator=36, WS=37, TEXT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "Letter", "Digit", "Boolean_value", 
			"Arithmetic_operator", "Comparison_operator", "Logical_operator", "Assignment_operator", 
			"WS", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START TUMCAD'", "'FINISH'", "'Return'", "'if'", "'('", "')'", 
			"'{'", "'}'", "'else'", "'foreach'", "'in'", "'readXLS'", "'readTXT'", 
			"'area'", "'sketch'", "'='", "'_'", "'[]'", "'.'", "'Int'", "'Double'", 
			"'String'", "'Bool'", "'Void'", "'Func'", "'void'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Letter", "Digit", "Boolean_value", 
			"Arithmetic_operator", "Comparison_operator", "Logical_operator", "Assignment_operator", 
			"WS", "TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public tumcadGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tumcadGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\5\37\u00d8\n\37\3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u00e5\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u00f2\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00fd\n$\3%\3%\3%\3%\3%\5%\u0104"+
		"\n%\3&\3&\3&\3&\3\'\3\'\6\'\u010c\n\'\r\'\16\'\u010d\3\'\3\'\2\2(\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\b\4\2C\\c|\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\5\2"+
		"\13\f\17\17\"\"\3\2$$\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3"+
		"\2\2\2\5\\\3\2\2\2\7c\3\2\2\2\tj\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3"+
		"\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25z\3\2\2\2\27\u0082\3\2\2\2\31\u0085\3"+
		"\2\2\2\33\u008d\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!\u00a1\3\2\2"+
		"\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3\2\2\2+\u00ae"+
		"\3\2\2\2-\u00b5\3\2\2\2/\u00bc\3\2\2\2\61\u00c1\3\2\2\2\63\u00c6\3\2\2"+
		"\2\65\u00cb\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d7"+
		"\3\2\2\2?\u00d9\3\2\2\2A\u00e4\3\2\2\2C\u00e6\3\2\2\2E\u00f1\3\2\2\2G"+
		"\u00fc\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u0109\3\2\2\2OP\7U\2\2P"+
		"Q\7V\2\2QR\7C\2\2RS\7T\2\2ST\7V\2\2TU\7\"\2\2UV\7V\2\2VW\7W\2\2WX\7O\2"+
		"\2XY\7E\2\2YZ\7C\2\2Z[\7F\2\2[\4\3\2\2\2\\]\7H\2\2]^\7K\2\2^_\7P\2\2_"+
		"`\7K\2\2`a\7U\2\2ab\7J\2\2b\6\3\2\2\2cd\7T\2\2de\7g\2\2ef\7v\2\2fg\7w"+
		"\2\2gh\7t\2\2hi\7p\2\2i\b\3\2\2\2jk\7k\2\2kl\7h\2\2l\n\3\2\2\2mn\7*\2"+
		"\2n\f\3\2\2\2op\7+\2\2p\16\3\2\2\2qr\7}\2\2r\20\3\2\2\2st\7\177\2\2t\22"+
		"\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\24\3\2\2\2z{\7h\2\2{|\7"+
		"q\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2\2\177\u0080\7e\2\2\u0080\u0081\7j\2"+
		"\2\u0081\26\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\30\3\2"+
		"\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7f\2\2\u0089\u008a\7Z\2\2\u008a\u008b\7N\2\2\u008b\u008c\7U\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7f\2\2\u0091\u0092\7V\2\2\u0092\u0093\7Z\2\2\u0093\u0094\7V\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2\u0097\u0098\7"+
		"g\2\2\u0098\u0099\7c\2\2\u0099\36\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7m\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7a\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7]\2\2\u00a6\u00a7\7_\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\7\60\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7K\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad*\3\2\2\2\u00ae\u00af\7F\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7n\2\2"+
		"\u00b3\u00b4\7g\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7U\2\2\u00b6\u00b7\7v\2"+
		"\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7i\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7D\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7n\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7X\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7f\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\7H\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\64\3\2\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7f\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7.\2\2\u00d18\3\2\2\2\u00d2"+
		"\u00d3\7]\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5<\3\2\2\2\u00d6\u00d8"+
		"\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d8>\3\2\2\2\u00d9\u00da\t\3\2\2\u00da"+
		"@\3\2\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00e5\7g\2\2\u00df\u00e0\7H\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\u00e3\7u\2\2\u00e3\u00e5\7g\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df"+
		"\3\2\2\2\u00e5B\3\2\2\2\u00e6\u00e7\t\4\2\2\u00e7D\3\2\2\2\u00e8\u00f2"+
		"\t\5\2\2\u00e9\u00ea\7>\2\2\u00ea\u00f2\7?\2\2\u00eb\u00ec\7@\2\2\u00ec"+
		"\u00f2\7?\2\2\u00ed\u00ee\7?\2\2\u00ee\u00f2\7?\2\2\u00ef\u00f0\7#\2\2"+
		"\u00f0\u00f2\7?\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00eb"+
		"\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2F\3\2\2\2\u00f3"+
		"\u00f4\7(\2\2\u00f4\u00fd\7(\2\2\u00f5\u00f6\7~\2\2\u00f6\u00fd\7~\2\2"+
		"\u00f7\u00f8\7C\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fd\7f\2\2\u00fa\u00fb"+
		"\7Q\2\2\u00fb\u00fd\7t\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fdH\3\2\2\2\u00fe\u0104\7?\2\2\u00ff"+
		"\u0100\7-\2\2\u0100\u0104\7?\2\2\u0101\u0102\7/\2\2\u0102\u0104\7?\2\2"+
		"\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104J\3"+
		"\2\2\2\u0105\u0106\t\6\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b&\2\2\u0108"+
		"L\3\2\2\2\u0109\u010b\7$\2\2\u010a\u010c\n\7\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\7$\2\2\u0110N\3\2\2\2\t\2\u00d7\u00e4\u00f1\u00fc\u0103"+
		"\u010d\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}