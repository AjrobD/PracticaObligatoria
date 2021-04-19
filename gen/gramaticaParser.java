// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCION=1, PROCEDIMIENTO=2, ABRIR_PARENTESIS=3, CERRAR_PARENTESIS=4, ENTERO=5, 
		REAL=6, CARACTER=7, INICIO=8, FIN=9, PUNTO_Y_COMA=10, RETURN=11, COMA=12, 
		IGUAL=13, MAS_IGUAL=14, MENOS_IGUAL=15, POR_IGUAL=16, ENTRE_IGUAL=17, 
		MAS=18, MENOS=19, MULTIPLICACION=20, DIVISION=21, BIFURCACION=22, ENTONCES=23, 
		SINO=24, BUCLEPARA=25, BUCLEMIENTRIAS=26, BUCLE=27, HASTA=28, NO=29, CIERTO=30, 
		FALSO=31, Y=32, O=33, IGUAL_IGUAL=34, DISTINTO=35, MENOR=36, MAYOR=37, 
		MAYOR_IGUAL=38, MENOR_IGUAL=39, CONSTENTERO=40, CONSTREAL=41, IDENTIFICADOR=42, 
		LINE_COMENT=43, MULTI_COMENT=44, CONSTLIT=45, WHITESPACE=46;
	public static final int
		RULE_program = 0, RULE_help1 = 1, RULE_part = 2, RULE_restpart = 3, RULE_listparam = 4, 
		RULE_type = 5, RULE_blq = 6, RULE_sentlist = 7, RULE_sent = 8, RULE_lid = 9, 
		RULE_asig = 10, RULE_exp = 11, RULE_op = 12, RULE_lcond = 13, RULE_cond = 14, 
		RULE_opl = 15, RULE_opr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "help1", "part", "restpart", "listparam", "type", "blq", "sentlist", 
			"sent", "lid", "asig", "exp", "op", "lcond", "cond", "opl", "opr"
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
			"SINO", "BUCLEPARA", "BUCLEMIENTRIAS", "BUCLE", "HASTA", "NO", "CIERTO", 
			"FALSO", "Y", "O", "IGUAL_IGUAL", "DISTINTO", "MENOR", "MAYOR", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "CONSTENTERO", "CONSTREAL", "IDENTIFICADOR", "LINE_COMENT", 
			"MULTI_COMENT", "CONSTLIT", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Help1Context help1() {
			return getRuleContext(Help1Context.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			part();
			setState(35);
			help1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Help1Context extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Help1Context help1() {
			return getRuleContext(Help1Context.class,0);
		}
		public Help1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterHelp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitHelp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitHelp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Help1Context help1() throws RecognitionException {
		Help1Context _localctx = new Help1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_help1);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				part();
				setState(38);
				help1();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(gramaticaParser.FUNCION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public TerminalNode PROCEDIMIENTO() { return getToken(gramaticaParser.PROCEDIMIENTO, 0); }
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(FUNCION);
				setState(44);
				type();
				setState(45);
				restpart();
				}
				break;
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(PROCEDIMIENTO);
				setState(48);
				restpart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_restpart);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(IDENTIFICADOR);
				setState(52);
				match(ABRIR_PARENTESIS);
				setState(53);
				listparam(0);
				setState(54);
				match(CERRAR_PARENTESIS);
				setState(55);
				blq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IDENTIFICADOR);
				setState(58);
				match(ABRIR_PARENTESIS);
				setState(59);
				match(CERRAR_PARENTESIS);
				setState(60);
				blq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		return listparam(0);
	}

	private ListparamContext listparam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListparamContext _localctx = new ListparamContext(_ctx, _parentState);
		ListparamContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_listparam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			type();
			setState(65);
			match(IDENTIFICADOR);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListparamContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listparam);
					setState(67);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(68);
					match(COMA);
					setState(69);
					type();
					setState(70);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(gramaticaParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(gramaticaParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(gramaticaParser.CARACTER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << REAL) | (1L << CARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlqContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(gramaticaParser.INICIO, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(INICIO);
			setState(80);
			sentlist(0);
			setState(81);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		return sentlist(0);
	}

	private SentlistContext sentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentlistContext _localctx = new SentlistContext(_ctx, _parentState);
		SentlistContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_sentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			sent();
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentlist);
					setState(86);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(87);
					sent();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(gramaticaParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(gramaticaParser.PUNTO_Y_COMA, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(gramaticaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(gramaticaParser.IDENTIFICADOR, i);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(gramaticaParser.RETURN, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public TerminalNode BIFURCACION() { return getToken(gramaticaParser.BIFURCACION, 0); }
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(gramaticaParser.ENTONCES, 0); }
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
		public TerminalNode BUCLEPARA() { return getToken(gramaticaParser.BUCLEPARA, 0); }
		public TerminalNode BUCLEMIENTRIAS() { return getToken(gramaticaParser.BUCLEMIENTRIAS, 0); }
		public TerminalNode BUCLE() { return getToken(gramaticaParser.BUCLE, 0); }
		public TerminalNode HASTA() { return getToken(gramaticaParser.HASTA, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sent);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				type();
				setState(94);
				lid();
				setState(95);
				match(PUNTO_Y_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IDENTIFICADOR);
				setState(98);
				asig();
				setState(99);
				exp(0);
				setState(100);
				match(PUNTO_Y_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(RETURN);
				setState(103);
				exp(0);
				setState(104);
				match(PUNTO_Y_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(IDENTIFICADOR);
				setState(107);
				match(ABRIR_PARENTESIS);
				setState(108);
				lid();
				setState(109);
				match(CERRAR_PARENTESIS);
				setState(110);
				match(PUNTO_Y_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(IDENTIFICADOR);
				setState(113);
				match(ABRIR_PARENTESIS);
				setState(114);
				match(CERRAR_PARENTESIS);
				setState(115);
				match(PUNTO_Y_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(BIFURCACION);
				setState(117);
				match(ABRIR_PARENTESIS);
				setState(118);
				lcond(0);
				setState(119);
				match(CERRAR_PARENTESIS);
				setState(120);
				match(ENTONCES);
				setState(121);
				blq();
				setState(122);
				match(SINO);
				setState(123);
				blq();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(BUCLEPARA);
				setState(126);
				match(ABRIR_PARENTESIS);
				setState(127);
				match(IDENTIFICADOR);
				setState(128);
				asig();
				setState(129);
				exp(0);
				setState(130);
				match(PUNTO_Y_COMA);
				setState(131);
				lcond(0);
				setState(132);
				match(PUNTO_Y_COMA);
				setState(133);
				match(IDENTIFICADOR);
				setState(134);
				asig();
				setState(135);
				exp(0);
				setState(136);
				match(CERRAR_PARENTESIS);
				setState(137);
				blq();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				match(BUCLEMIENTRIAS);
				setState(140);
				match(ABRIR_PARENTESIS);
				setState(141);
				lcond(0);
				setState(142);
				match(CERRAR_PARENTESIS);
				setState(143);
				blq();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				match(BUCLE);
				setState(146);
				blq();
				setState(147);
				match(HASTA);
				setState(148);
				match(ABRIR_PARENTESIS);
				setState(149);
				lcond(0);
				setState(150);
				match(CERRAR_PARENTESIS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				blq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LidContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lid);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(IDENTIFICADOR);
				setState(157);
				match(COMA);
				setState(158);
				lid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode MAS_IGUAL() { return getToken(gramaticaParser.MAS_IGUAL, 0); }
		public TerminalNode MENOS_IGUAL() { return getToken(gramaticaParser.MENOS_IGUAL, 0); }
		public TerminalNode POR_IGUAL() { return getToken(gramaticaParser.POR_IGUAL, 0); }
		public TerminalNode ENTRE_IGUAL() { return getToken(gramaticaParser.ENTRE_IGUAL, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAS_IGUAL) | (1L << MENOS_IGUAL) | (1L << POR_IGUAL) | (1L << ENTRE_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CONSTENTERO() { return getToken(gramaticaParser.CONSTENTERO, 0); }
		public TerminalNode CONSTREAL() { return getToken(gramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(gramaticaParser.CONSTLIT, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(164);
				match(IDENTIFICADOR);
				setState(165);
				match(ABRIR_PARENTESIS);
				setState(166);
				lid();
				setState(167);
				match(CERRAR_PARENTESIS);
				}
				break;
			case 2:
				{
				setState(169);
				match(ABRIR_PARENTESIS);
				setState(170);
				exp(0);
				setState(171);
				match(CERRAR_PARENTESIS);
				}
				break;
			case 3:
				{
				setState(173);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				{
				setState(174);
				match(CONSTENTERO);
				}
				break;
			case 5:
				{
				setState(175);
				match(CONSTREAL);
				}
				break;
			case 6:
				{
				setState(176);
				match(CONSTLIT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(179);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(180);
					op();
					setState(181);
					exp(8);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(gramaticaParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(gramaticaParser.MENOS, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(gramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(gramaticaParser.DIVISION, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LcondContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode NO() { return getToken(gramaticaParser.NO, 0); }
		public List<LcondContext> lcond() {
			return getRuleContexts(LcondContext.class);
		}
		public LcondContext lcond(int i) {
			return getRuleContext(LcondContext.class,i);
		}
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		return lcond(0);
	}

	private LcondContext lcond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LcondContext _localctx = new LcondContext(_ctx, _parentState);
		LcondContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lcond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
			case CIERTO:
			case FALSO:
			case CONSTENTERO:
			case CONSTREAL:
			case IDENTIFICADOR:
			case CONSTLIT:
				{
				setState(191);
				cond();
				}
				break;
			case NO:
				{
				setState(192);
				match(NO);
				setState(193);
				cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LcondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lcond);
					setState(196);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(197);
					opl();
					setState(198);
					lcond(4);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode CIERTO() { return getToken(gramaticaParser.CIERTO, 0); }
		public TerminalNode FALSO() { return getToken(gramaticaParser.FALSO, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
			case CONSTENTERO:
			case CONSTREAL:
			case IDENTIFICADOR:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				exp(0);
				setState(206);
				opr();
				setState(207);
				exp(0);
				}
				break;
			case CIERTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(CIERTO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(FALSO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(gramaticaParser.Y, 0); }
		public TerminalNode O() { return getToken(gramaticaParser.O, 0); }
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==Y || _la==O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprContext extends ParserRuleContext {
		public TerminalNode IGUAL_IGUAL() { return getToken(gramaticaParser.IGUAL_IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(gramaticaParser.DISTINTO, 0); }
		public TerminalNode MENOR() { return getToken(gramaticaParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(gramaticaParser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(gramaticaParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(gramaticaParser.MENOR_IGUAL, 0); }
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL_IGUAL) | (1L << DISTINTO) | (1L << MENOR) | (1L << MAYOR) | (1L << MAYOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return listparam_sempred((ListparamContext)_localctx, predIndex);
		case 7:
			return sentlist_sempred((SentlistContext)_localctx, predIndex);
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return lcond_sempred((LcondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listparam_sempred(ListparamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sentlist_sempred(SentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean lcond_sempred(LcondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\7\t[\n\t\f\t\16\t^\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u009c\n\n\3\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17\u00c5\n\17\3\17\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\2\6\n\20\30\34\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7"+
		"\3\2\7\t\3\2\17\23\3\2\24\27\3\2\"#\3\2$)\2\u00e3\2$\3\2\2\2\4+\3\2\2"+
		"\2\6\63\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2\20U\3\2\2"+
		"\2\22\u009b\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00b3\3\2\2\2"+
		"\32\u00be\3\2\2\2\34\u00c4\3\2\2\2\36\u00d5\3\2\2\2 \u00d7\3\2\2\2\"\u00d9"+
		"\3\2\2\2$%\5\6\4\2%&\5\4\3\2&\3\3\2\2\2\'(\5\6\4\2()\5\4\3\2),\3\2\2\2"+
		"*,\3\2\2\2+\'\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\3\2\2./\5\f\7\2/\60\5\b"+
		"\5\2\60\64\3\2\2\2\61\62\7\4\2\2\62\64\5\b\5\2\63-\3\2\2\2\63\61\3\2\2"+
		"\2\64\7\3\2\2\2\65\66\7,\2\2\66\67\7\5\2\2\678\5\n\6\289\7\6\2\29:\5\16"+
		"\b\2:@\3\2\2\2;<\7,\2\2<=\7\5\2\2=>\7\6\2\2>@\5\16\b\2?\65\3\2\2\2?;\3"+
		"\2\2\2@\t\3\2\2\2AB\b\6\1\2BC\5\f\7\2CD\7,\2\2DL\3\2\2\2EF\f\4\2\2FG\7"+
		"\16\2\2GH\5\f\7\2HI\7,\2\2IK\3\2\2\2JE\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3"+
		"\2\2\2M\13\3\2\2\2NL\3\2\2\2OP\t\2\2\2P\r\3\2\2\2QR\7\n\2\2RS\5\20\t\2"+
		"ST\7\13\2\2T\17\3\2\2\2UV\b\t\1\2VW\5\22\n\2W\\\3\2\2\2XY\f\4\2\2Y[\5"+
		"\22\n\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\21\3\2\2\2^\\\3\2\2"+
		"\2_`\5\f\7\2`a\5\24\13\2ab\7\f\2\2b\u009c\3\2\2\2cd\7,\2\2de\5\26\f\2"+
		"ef\5\30\r\2fg\7\f\2\2g\u009c\3\2\2\2hi\7\r\2\2ij\5\30\r\2jk\7\f\2\2k\u009c"+
		"\3\2\2\2lm\7,\2\2mn\7\5\2\2no\5\24\13\2op\7\6\2\2pq\7\f\2\2q\u009c\3\2"+
		"\2\2rs\7,\2\2st\7\5\2\2tu\7\6\2\2u\u009c\7\f\2\2vw\7\30\2\2wx\7\5\2\2"+
		"xy\5\34\17\2yz\7\6\2\2z{\7\31\2\2{|\5\16\b\2|}\7\32\2\2}~\5\16\b\2~\u009c"+
		"\3\2\2\2\177\u0080\7\33\2\2\u0080\u0081\7\5\2\2\u0081\u0082\7,\2\2\u0082"+
		"\u0083\5\26\f\2\u0083\u0084\5\30\r\2\u0084\u0085\7\f\2\2\u0085\u0086\5"+
		"\34\17\2\u0086\u0087\7\f\2\2\u0087\u0088\7,\2\2\u0088\u0089\5\26\f\2\u0089"+
		"\u008a\5\30\r\2\u008a\u008b\7\6\2\2\u008b\u008c\5\16\b\2\u008c\u009c\3"+
		"\2\2\2\u008d\u008e\7\34\2\2\u008e\u008f\7\5\2\2\u008f\u0090\5\34\17\2"+
		"\u0090\u0091\7\6\2\2\u0091\u0092\5\16\b\2\u0092\u009c\3\2\2\2\u0093\u0094"+
		"\7\35\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\36\2\2\u0096\u0097\7\5\2"+
		"\2\u0097\u0098\5\34\17\2\u0098\u0099\7\6\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u009c\5\16\b\2\u009b_\3\2\2\2\u009bc\3\2\2\2\u009bh\3\2\2\2\u009bl\3"+
		"\2\2\2\u009br\3\2\2\2\u009bv\3\2\2\2\u009b\177\3\2\2\2\u009b\u008d\3\2"+
		"\2\2\u009b\u0093\3\2\2\2\u009b\u009a\3\2\2\2\u009c\23\3\2\2\2\u009d\u00a2"+
		"\7,\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a2\5\24\13\2"+
		"\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a4"+
		"\t\3\2\2\u00a4\27\3\2\2\2\u00a5\u00a6\b\r\1\2\u00a6\u00a7\7,\2\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa\7\6\2\2\u00aa\u00b4\3"+
		"\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\6\2\2\u00ae"+
		"\u00b4\3\2\2\2\u00af\u00b4\7,\2\2\u00b0\u00b4\7*\2\2\u00b1\u00b4\7+\2"+
		"\2\u00b2\u00b4\7/\2\2\u00b3\u00a5\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00bb\3\2\2\2\u00b5\u00b6\f\t\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\5"+
		"\30\r\n\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00bf\t\4\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\b\17\1\2\u00c1\u00c5"+
		"\5\36\20\2\u00c2\u00c3\7\37\2\2\u00c3\u00c5\5\36\20\2\u00c4\u00c0\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\f\5\2\2\u00c7"+
		"\u00c8\5 \21\2\u00c8\u00c9\5\34\17\6\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3"+
		"\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\5\"\22"+
		"\2\u00d1\u00d2\5\30\r\2\u00d2\u00d6\3\2\2\2\u00d3\u00d6\7 \2\2\u00d4\u00d6"+
		"\7!\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\37\3\2\2\2\u00d7\u00d8\t\5\2\2\u00d8!\3\2\2\2\u00d9\u00da\t\6\2\2\u00da"+
		"#\3\2\2\2\16+\63?L\\\u009b\u00a1\u00b3\u00bb\u00c4\u00cc\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}