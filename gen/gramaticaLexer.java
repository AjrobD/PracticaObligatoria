// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
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
		LINE_COMENT=43, MULTI_COMENT=44, CONSTLIT=45, WHITESPACE=46, COMENTARIOS=47;
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
			"MULTI_COMENT", "CONSTLIT", "STUFF", "COMILLA_DOBLE", "COMILLA_SIMPLE", 
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
			"MULTI_COMENT", "CONSTLIT", "WHITESPACE", "COMENTARIOS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u019b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\5)\u0126"+
		"\n)\3)\6)\u0129\n)\r)\16)\u012a\3)\3)\6)\u012f\n)\r)\16)\u0130\5)\u0133"+
		"\n)\3*\5*\u0136\n*\3*\6*\u0139\n*\r*\16*\u013a\3*\3*\6*\u013f\n*\r*\16"+
		"*\u0140\3*\3*\6*\u0145\n*\r*\16*\u0146\3*\3*\6*\u014b\n*\r*\16*\u014c"+
		"\5*\u014f\n*\3+\6+\u0152\n+\r+\16+\u0153\3+\7+\u0157\n+\f+\16+\u015a\13"+
		"+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u0168\n-\f-\16-\u016b\13-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0178\n.\3/\6/\u017b\n/\r/\16/\u017c"+
		"\3\60\3\60\3\60\6\60\u0182\n\60\r\60\16\60\u0183\3\61\3\61\3\61\6\61\u0189"+
		"\n\61\r\61\16\61\u018a\3\62\6\62\u018e\n\62\r\62\16\62\u018f\3\62\3\62"+
		"\3\63\3\63\6\63\u0196\n\63\r\63\16\63\u0197\3\63\3\63\2\2\64\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\60e\61\3\2\r\4\2--//\3\2\62;\4\2"+
		"\62;CH\4\2aac|\7\2*+\62;C\\aac|\3\2//\3\2\'\'\3\2\f\f\3\2$$\3\2))\5\2"+
		"\13\f\16\17\"\"\2\u01ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081"+
		"\3\2\2\2\r\u0088\3\2\2\2\17\u008d\3\2\2\2\21\u0096\3\2\2\2\23\u009d\3"+
		"\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00aa\3\2\2\2\33\u00ac\3\2"+
		"\2\2\35\u00ae\3\2\2\2\37\u00b1\3\2\2\2!\u00b4\3\2\2\2#\u00b7\3\2\2\2%"+
		"\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00ce\3\2\2\2\61\u00d7\3\2\2\2\63\u00dc\3\2\2\2\65\u00e6\3\2\2"+
		"\2\67\u00f4\3\2\2\29\u00fa\3\2\2\2;\u0100\3\2\2\2=\u0103\3\2\2\2?\u010a"+
		"\3\2\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I"+
		"\u011a\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2\2\2O\u0121\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0135\3\2\2\2U\u0151\3\2\2\2W\u015b\3\2\2\2Y\u0161\3\2\2\2[\u0177"+
		"\3\2\2\2]\u017a\3\2\2\2_\u0181\3\2\2\2a\u0188\3\2\2\2c\u018d\3\2\2\2e"+
		"\u0195\3\2\2\2gh\7h\2\2hi\7w\2\2ij\7p\2\2jk\7e\2\2kl\7k\2\2lm\7q\2\2m"+
		"n\7p\2\2n\4\3\2\2\2op\7r\2\2pq\7t\2\2qr\7q\2\2rs\7e\2\2st\7g\2\2tu\7f"+
		"\2\2uv\7k\2\2vw\7o\2\2wx\7k\2\2xy\7g\2\2yz\7p\2\2z{\7v\2\2{|\7q\2\2|\6"+
		"\3\2\2\2}~\7*\2\2~\b\3\2\2\2\177\u0080\7+\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\f\3\2\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\16\3\2\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2"+
		"\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7t\2\2\u0095\20\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7e\2\2\u009a\u009b\7k\2\2\u009b\u009c\7q\2\2\u009c"+
		"\22\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\24\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7t\2\2"+
		"\u00a8\u00a9\7p\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab\32\3\2\2"+
		"\2\u00ac\u00ad\7?\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7?\2\2\u00b3 "+
		"\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b6\7?\2\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\7\61\2\2\u00b8\u00b9\7?\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb&"+
		"\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd(\3\2\2\2\u00be\u00bf\7,\2\2\u00bf*\3"+
		"\2\2\2\u00c0\u00c1\7\61\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7k\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7g\2"+
		"\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7u\2\2\u00d6"+
		"\60\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7q\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7r\2\2"+
		"\u00e2\u00e3\7c\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5\64\3\2"+
		"\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea"+
		"\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2"+
		"\u00f1\u00f2\7c\2\2\u00f2\u00f3\7u\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7"+
		"d\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f98\3\2\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7c\2\2\u00ff:\3\2\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7q\2\2\u0102<\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105"+
		"\7k\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7q\2\2\u0109>\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7n\2\2\u010d\u010e\7u\2\2\u010e\u010f\7q\2\2\u010f@\3\2\2\2\u0110"+
		"\u0111\7{\2\2\u0111B\3\2\2\2\u0112\u0113\7q\2\2\u0113D\3\2\2\2\u0114\u0115"+
		"\7?\2\2\u0115\u0116\7?\2\2\u0116F\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119"+
		"\7@\2\2\u0119H\3\2\2\2\u011a\u011b\7>\2\2\u011bJ\3\2\2\2\u011c\u011d\7"+
		"@\2\2\u011dL\3\2\2\2\u011e\u011f\7@\2\2\u011f\u0120\7?\2\2\u0120N\3\2"+
		"\2\2\u0121\u0122\7>\2\2\u0122\u0123\7?\2\2\u0123P\3\2\2\2\u0124\u0126"+
		"\t\2\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0132\3\2\2\2\u0127"+
		"\u0129\t\3\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0133\3\2\2\2\u012c\u012e\7&\2\2\u012d"+
		"\u012f\t\4\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132"+
		"\u012c\3\2\2\2\u0133R\3\2\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u014e\3\2\2\2\u0137\u0139\t\3\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\7\60\2\2\u013d\u013f\t\3\2\2\u013e\u013d\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u014f\3\2\2\2\u0142\u0144\7&\2\2\u0143\u0145\t\4\2\2\u0144\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\7\60\2\2\u0149\u014b\t\4\2\2\u014a\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0138\3\2\2\2\u014e\u0142\3\2\2\2\u014fT\3\2\2\2"+
		"\u0150\u0152\t\5\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158\3\2\2\2\u0155\u0157\t\6\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159V\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\'\2\2\u015c\u015d"+
		"\7\'\2\2\u015d\u015e\3\2\2\2\u015e\u015f\5]/\2\u015f\u0160\7\f\2\2\u0160"+
		"X\3\2\2\2\u0161\u0162\7\'\2\2\u0162\u0163\7/\2\2\u0163\u0169\3\2\2\2\u0164"+
		"\u0168\n\7\2\2\u0165\u0166\7/\2\2\u0166\u0168\n\b\2\2\u0167\u0164\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7/"+
		"\2\2\u016d\u016e\7\'\2\2\u016eZ\3\2\2\2\u016f\u0170\7$\2\2\u0170\u0171"+
		"\5_\60\2\u0171\u0172\7$\2\2\u0172\u0178\3\2\2\2\u0173\u0174\7)\2\2\u0174"+
		"\u0175\5a\61\2\u0175\u0176\7)\2\2\u0176\u0178\3\2\2\2\u0177\u016f\3\2"+
		"\2\2\u0177\u0173\3\2\2\2\u0178\\\3\2\2\2\u0179\u017b\n\t\2\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"^\3\2\2\2\u017e\u017f\7$\2\2\u017f\u0182\7$\2\2\u0180\u0182\n\n\2\2\u0181"+
		"\u017e\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184`\3\2\2\2\u0185\u0186\7)\2\2\u0186\u0189"+
		"\7)\2\2\u0187\u0189\n\13\2\2\u0188\u0185\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bb\3\2\2\2"+
		"\u018c\u018e\t\f\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\62\2\2"+
		"\u0192d\3\2\2\2\u0193\u0196\5W,\2\u0194\u0196\5Y-\2\u0195\u0193\3\2\2"+
		"\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\b\63\2\2\u019af\3\2\2\2\32\2"+
		"\u0125\u012a\u0130\u0132\u0135\u013a\u0140\u0146\u014c\u014e\u0153\u0158"+
		"\u0167\u0169\u0177\u017c\u0181\u0183\u0188\u018a\u018f\u0195\u0197\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}