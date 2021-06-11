// Generated from C:/Users/Mario/Desktop/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCION=1, PROCEDIMIENTO=2, ABRIR_PARENTESIS=3, CERRAR_PARENTESIS=4, ENTERO=5, 
		REAL=6, CARACTER=7, INICIO=8, FIN=9, PUNTO_Y_COMA=10, RETURN=11, COMA=12, 
		IGUAL=13, MAS_IGUAL=14, MENOS_IGUAL=15, POR_IGUAL=16, ENTRE_IGUAL=17, 
		MAS=18, MENOS=19, MULTIPLICACION=20, DIVISION=21, BIFURCACION=22, ENTONCES=23, 
		SINO=24, BUCLEPARA=25, BUCLEMIENTRAS=26, BUCLE=27, HASTA=28, NO=29, CIERTO=30, 
		FALSO=31, Y=32, O=33, IGUAL_IGUAL=34, DISTINTO=35, MENOR=36, MAYOR=37, 
		MAYOR_IGUAL=38, MENOR_IGUAL=39, CONSTENTERO=40, CONSTREAL=41, IDENTIFICADOR=42, 
		LINE_COMENT=43, MULTI_COMENT=44, IGNORE=45, CONSTLIT=46, WHITESPACE=47, 
		COMENTARIOS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCION", "PROCEDIMIENTO", "ABRIR_PARENTESIS", "CERRAR_PARENTESIS", 
			"ENTERO", "REAL", "CARACTER", "INICIO", "FIN", "PUNTO_Y_COMA", "RETURN", 
			"COMA", "IGUAL", "MAS_IGUAL", "MENOS_IGUAL", "POR_IGUAL", "ENTRE_IGUAL", 
			"MAS", "MENOS", "MULTIPLICACION", "DIVISION", "BIFURCACION", "ENTONCES", 
			"SINO", "BUCLEPARA", "BUCLEMIENTRAS", "BUCLE", "HASTA", "NO", "CIERTO", 
			"FALSO", "Y", "O", "IGUAL_IGUAL", "DISTINTO", "MENOR", "MAYOR", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "CONSTENTERO", "CONSTREAL", "IDENTIFICADOR", "LINE_COMENT", 
			"MULTI_COMENT", "IGNORE", "CONSTLIT", "STUFF", "COMILLA_DOBLE", "COMILLA_SIMPLE", 
			"WHITESPACE", "COMENTARIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "'entero'", "'real'", 
			"'caracter'", "'inicio'", "'fin'", "';'", "'return'", "','", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'+'", "'-'", "'*'", "'/'", "'bifurcacion'", 
			"'entonces'", "'sino'", "'buclepara'", "'buclemientras'", "'bucle'", 
			"'hasta'", "'no'", "'cierto'", "'falso'", "'y'", "'o'", "'=='", "'<>'", 
			"'<'", "'>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCION", "PROCEDIMIENTO", "ABRIR_PARENTESIS", "CERRAR_PARENTESIS", 
			"ENTERO", "REAL", "CARACTER", "INICIO", "FIN", "PUNTO_Y_COMA", "RETURN", 
			"COMA", "IGUAL", "MAS_IGUAL", "MENOS_IGUAL", "POR_IGUAL", "ENTRE_IGUAL", 
			"MAS", "MENOS", "MULTIPLICACION", "DIVISION", "BIFURCACION", "ENTONCES", 
			"SINO", "BUCLEPARA", "BUCLEMIENTRAS", "BUCLE", "HASTA", "NO", "CIERTO", 
			"FALSO", "Y", "O", "IGUAL_IGUAL", "DISTINTO", "MENOR", "MAYOR", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "CONSTENTERO", "CONSTREAL", "IDENTIFICADOR", "LINE_COMENT", 
			"MULTI_COMENT", "IGNORE", "CONSTLIT", "WHITESPACE", "COMENTARIOS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\5)\u0128\n)\3)\6)\u012b\n)\r)\16)\u012c\3)\3)\6)\u0131\n)\r)\16)\u0132"+
		"\5)\u0135\n)\3*\5*\u0138\n*\3*\6*\u013b\n*\r*\16*\u013c\3*\3*\6*\u0141"+
		"\n*\r*\16*\u0142\3*\3*\6*\u0147\n*\r*\16*\u0148\3*\3*\6*\u014d\n*\r*\16"+
		"*\u014e\5*\u0151\n*\3+\6+\u0154\n+\r+\16+\u0155\3+\7+\u0159\n+\f+\16+"+
		"\u015c\13+\3,\3,\3,\3,\7,\u0162\n,\f,\16,\u0165\13,\3,\3,\3,\3-\3-\3-"+
		"\3-\7-\u016e\n-\f-\16-\u0171\13-\3-\3-\3.\3.\3.\5.\u0178\n.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0184\n/\3\60\6\60\u0187\n\60\r\60\16\60\u0188"+
		"\3\61\3\61\3\61\6\61\u018e\n\61\r\61\16\61\u018f\3\62\3\62\3\62\6\62\u0195"+
		"\n\62\r\62\16\62\u0196\3\63\6\63\u019a\n\63\r\63\16\63\u019b\3\63\3\63"+
		"\3\64\3\64\6\64\u01a2\n\64\r\64\16\64\u01a3\3\64\3\64\3\u0163\2\65\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\61g\62\3\2\13\4\2--//\3\2"+
		"\62;\4\2\62;CH\4\2aac|\7\2*+\62;C\\aac|\3\2\f\f\3\2$$\3\2))\5\2\13\f\16"+
		"\17\"\"\2\u01bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2"+
		"\2\13\u0083\3\2\2\2\r\u008a\3\2\2\2\17\u008f\3\2\2\2\21\u0098\3\2\2\2"+
		"\23\u009f\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5\3\2\2\2\31\u00ac\3\2\2\2\33"+
		"\u00ae\3\2\2\2\35\u00b0\3\2\2\2\37\u00b3\3\2\2\2!\u00b6\3\2\2\2#\u00b9"+
		"\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c2\3\2\2\2"+
		"-\u00c4\3\2\2\2/\u00d0\3\2\2\2\61\u00d9\3\2\2\2\63\u00de\3\2\2\2\65\u00e8"+
		"\3\2\2\2\67\u00f6\3\2\2\29\u00fc\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2"+
		"?\u010c\3\2\2\2A\u0112\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u0119\3"+
		"\2\2\2I\u011c\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O\u0123\3\2\2\2Q\u0127"+
		"\3\2\2\2S\u0137\3\2\2\2U\u0153\3\2\2\2W\u015d\3\2\2\2Y\u0169\3\2\2\2["+
		"\u0177\3\2\2\2]\u0183\3\2\2\2_\u0186\3\2\2\2a\u018d\3\2\2\2c\u0194\3\2"+
		"\2\2e\u0199\3\2\2\2g\u01a1\3\2\2\2ij\7h\2\2jk\7w\2\2kl\7p\2\2lm\7e\2\2"+
		"mn\7k\2\2no\7q\2\2op\7p\2\2p\4\3\2\2\2qr\7r\2\2rs\7t\2\2st\7q\2\2tu\7"+
		"e\2\2uv\7g\2\2vw\7f\2\2wx\7k\2\2xy\7o\2\2yz\7k\2\2z{\7g\2\2{|\7p\2\2|"+
		"}\7v\2\2}~\7q\2\2~\6\3\2\2\2\177\u0080\7*\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7+\2\2\u0082\n\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089"+
		"\f\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7n\2\2\u008e\16\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7t\2\2\u0097\20\3\2\2\2\u0098\u0099\7"+
		"k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7k\2\2\u009b\u009c\7e\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7q\2\2\u009e\22\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7=\2\2\u00a4\26"+
		"\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7p\2\2\u00ab\30\3\2\2\2\u00ac"+
		"\u00ad\7.\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7?\2\2\u00af\34\3\2\2\2\u00b0"+
		"\u00b1\7-\2\2\u00b1\u00b2\7?\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7?\2\2\u00b8"+
		"\"\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7?\2\2\u00bb$\3\2\2\2\u00bc"+
		"\u00bd\7-\2\2\u00bd&\3\2\2\2\u00be\u00bf\7/\2\2\u00bf(\3\2\2\2\u00c0\u00c1"+
		"\7,\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3,\3\2\2\2\u00c4\u00c5"+
		"\7d\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7e\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf.\3\2\2"+
		"\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7q\2\2\u00dd\62\3\2\2\2\u00de\u00df\7d\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\u00e4\7r\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7o\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2"+
		"\u00f2\u00f3\7t\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\66\3\2"+
		"\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa"+
		"\7n\2\2\u00fa\u00fb\7g\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7j\2\2\u00fd\u00fe"+
		"\7c\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7c\2\2\u0101"+
		":\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7q\2\2\u0104<\3\2\2\2\u0105\u0106"+
		"\7e\2\2\u0106\u0107\7k\2\2\u0107\u0108\7g\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7q\2\2\u010b>\3\2\2\2\u010c\u010d\7h\2\2\u010d"+
		"\u010e\7c\2\2\u010e\u010f\7n\2\2\u010f\u0110\7u\2\2\u0110\u0111\7q\2\2"+
		"\u0111@\3\2\2\2\u0112\u0113\7{\2\2\u0113B\3\2\2\2\u0114\u0115\7q\2\2\u0115"+
		"D\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118\7?\2\2\u0118F\3\2\2\2\u0119\u011a"+
		"\7>\2\2\u011a\u011b\7@\2\2\u011bH\3\2\2\2\u011c\u011d\7>\2\2\u011dJ\3"+
		"\2\2\2\u011e\u011f\7@\2\2\u011fL\3\2\2\2\u0120\u0121\7@\2\2\u0121\u0122"+
		"\7?\2\2\u0122N\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125\7?\2\2\u0125P\3"+
		"\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0134\3\2\2\2\u0129\u012b\t\3\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2\2\2\u012e"+
		"\u0130\7&\2\2\u012f\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u012a\3\2\2\2\u0134\u012e\3\2\2\2\u0135R\3\2\2\2\u0136\u0138\t\2\2\2"+
		"\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0150\3\2\2\2\u0139\u013b"+
		"\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7\60\2\2\u013f\u0141\t"+
		"\3\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0151\3\2\2\2\u0144\u0146\7&\2\2\u0145\u0147\t\4"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\60\2\2\u014b\u014d\t"+
		"\4\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u013a\3\2\2\2\u0150\u0144\3\2"+
		"\2\2\u0151T\3\2\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015a\3\2\2\2\u0157"+
		"\u0159\t\6\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015bV\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e"+
		"\7\'\2\2\u015e\u015f\7/\2\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7/\2\2\u0167"+
		"\u0168\7\'\2\2\u0168X\3\2\2\2\u0169\u016a\7\'\2\2\u016a\u016b\7\'\2\2"+
		"\u016b\u016f\3\2\2\2\u016c\u016e\n\7\2\2\u016d\u016c\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\7\f\2\2\u0173Z\3\2\2\2\u0174\u0178\5W,\2\u0175"+
		"\u0178\5Y-\2\u0176\u0178\13\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b.\2\2\u017a"+
		"\\\3\2\2\2\u017b\u017c\7$\2\2\u017c\u017d\5a\61\2\u017d\u017e\7$\2\2\u017e"+
		"\u0184\3\2\2\2\u017f\u0180\7)\2\2\u0180\u0181\5c\62\2\u0181\u0182\7)\2"+
		"\2\u0182\u0184\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017f\3\2\2\2\u0184^"+
		"\3\2\2\2\u0185\u0187\n\7\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189`\3\2\2\2\u018a\u018b\7$\2\2\u018b"+
		"\u018e\7$\2\2\u018c\u018e\n\b\2\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"b\3\2\2\2\u0191\u0192\7)\2\2\u0192\u0195\7)\2\2\u0193\u0195\n\t\2\2\u0194"+
		"\u0191\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197d\3\2\2\2\u0198\u019a\t\n\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\b\63\2\2\u019ef\3\2\2\2\u019f\u01a2\5W,\2\u01a0"+
		"\u01a2\5Y-\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6"+
		"\b\64\2\2\u01a6h\3\2\2\2\33\2\u0127\u012c\u0132\u0134\u0137\u013c\u0142"+
		"\u0148\u014e\u0150\u0155\u015a\u0163\u016f\u0177\u0183\u0188\u018d\u018f"+
		"\u0194\u0196\u019b\u01a1\u01a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}