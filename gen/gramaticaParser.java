// Generated from C:/pl/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
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
		SINO=24, BUCLEPARA=25, BUCLEMIENTRAS=26, BUCLE=27, HASTA=28, NO=29, CIERTO=30, 
		FALSO=31, Y=32, O=33, IGUAL_IGUAL=34, DISTINTO=35, MENOR=36, MAYOR=37, 
		MAYOR_IGUAL=38, MENOR_IGUAL=39, CONSTENTERO=40, CONSTREAL=41, IDENTIFICADOR=42, 
		IGNORE=43, CONSTLIT=44, WHITESPACE=45;
	public static final int
		RULE_program = 0, RULE_aux1 = 1, RULE_part = 2, RULE_restpart = 3, RULE_aux2 = 4, 
		RULE_listparam = 5, RULE_listparamAux = 6, RULE_type = 7, RULE_blq = 8, 
		RULE_sentlist = 9, RULE_sentlistAux = 10, RULE_sent = 11, RULE_aux3 = 12, 
		RULE_aux3Prima = 13, RULE_aux4 = 14, RULE_lid = 15, RULE_aux5 = 16, RULE_asig = 17, 
		RULE_exp = 18, RULE_expAux = 19, RULE_aux6 = 20, RULE_op = 21, RULE_lcond = 22, 
		RULE_lcondAux = 23, RULE_cond = 24, RULE_opl = 25, RULE_opr = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "aux1", "part", "restpart", "aux2", "listparam", "listparamAux", 
			"type", "blq", "sentlist", "sentlistAux", "sent", "aux3", "aux3Prima", 
			"aux4", "lid", "aux5", "asig", "exp", "expAux", "aux6", "op", "lcond", 
			"lcondAux", "cond", "opl", "opr"
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
			"MENOR_IGUAL", "CONSTENTERO", "CONSTREAL", "IDENTIFICADOR", "IGNORE", 
			"CONSTLIT", "WHITESPACE"
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


	    private Program programa;

	    public gramaticaParser(TokenStream input, Program thePrograma){
	        this(input);
	        programa = thePrograma;
	    }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PartContext part;
		public Aux1Context aux1;
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Aux1Context aux1() {
			return getRuleContext(Aux1Context.class,0);
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
			setState(54);
			((ProgramContext)_localctx).part = part();
			setState(55);
			((ProgramContext)_localctx).aux1 = aux1();

			        Part parte = ((ProgramContext)_localctx).part.parte;
			        ArrayList<Part> partes = ((ProgramContext)_localctx).aux1.partes;
			        Program programa = new Program(parte,partes);
			        System.out.println(programa.toString());
			    
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

	public static class Aux1Context extends ParserRuleContext {
		public ArrayList<Part> partes;
		public PartContext part;
		public Aux1Context aux1;
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Aux1Context aux1() {
			return getRuleContext(Aux1Context.class,0);
		}
		public Aux1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux1Context aux1() throws RecognitionException {
		Aux1Context _localctx = new Aux1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_aux1);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((Aux1Context)_localctx).part = part();
				setState(59);
				((Aux1Context)_localctx).aux1 = aux1();

				        ((Aux1Context)_localctx).partes =  new ArrayList<Part>();
				        _localctx.partes.add(((Aux1Context)_localctx).part.parte);
				        _localctx.partes.addAll(((Aux1Context)_localctx).aux1.partes);
				    
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{

				        //Primera que se ejecuta, fin de la recursividad
				        ((Aux1Context)_localctx).partes =  new ArrayList<Part>();
				    
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
		public Part parte;
		public TypeContext type;
		public RestpartContext restpart;
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(FUNCION);
				setState(66);
				((PartContext)_localctx).type = type();
				setState(67);
				((PartContext)_localctx).restpart = restpart();

				        String tipo = ((PartContext)_localctx).type.tipo;
				        ((PartContext)_localctx).parte =  new Funcion(((PartContext)_localctx).restpart.nombre,tipo,((PartContext)_localctx).restpart.variables,((PartContext)_localctx).restpart.bloque);
				    
				}
				break;
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(PROCEDIMIENTO);
				setState(71);
				((PartContext)_localctx).restpart = restpart();

				        ((PartContext)_localctx).parte =  new Procedimiento(((PartContext)_localctx).restpart.nombre,((PartContext)_localctx).restpart.variables,((PartContext)_localctx).restpart.bloque);
				    
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
		public String nombre;
		public ArrayList<Parametro> variables;
		public Blq bloque;
		public Token IDENTIFICADOR;
		public Aux2Context aux2;
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public Aux2Context aux2() {
			return getRuleContext(Aux2Context.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((RestpartContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(77);
			match(ABRIR_PARENTESIS);
			setState(78);
			((RestpartContext)_localctx).aux2 = aux2();

			        ((RestpartContext)_localctx).nombre =  (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null);
			        ((RestpartContext)_localctx).variables =  ((RestpartContext)_localctx).aux2.parametros;
			        ((RestpartContext)_localctx).bloque =  ((RestpartContext)_localctx).aux2.bloque;
			    
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

	public static class Aux2Context extends ParserRuleContext {
		public ArrayList<Parametro> parametros;
		public Blq bloque;
		public ListparamContext listparam;
		public BlqContext blq;
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Aux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux2Context aux2() throws RecognitionException {
		Aux2Context _localctx = new Aux2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_aux2);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((Aux2Context)_localctx).listparam = listparam();
				setState(82);
				match(CERRAR_PARENTESIS);
				setState(83);
				((Aux2Context)_localctx).blq = blq(1);

				        ((Aux2Context)_localctx).parametros =  ((Aux2Context)_localctx).listparam.lista;
				        ((Aux2Context)_localctx).bloque =  ((Aux2Context)_localctx).blq.bloque;
				    
				}
				break;
			case CERRAR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(CERRAR_PARENTESIS);
				setState(87);
				((Aux2Context)_localctx).blq = blq(1);

				        ((Aux2Context)_localctx).parametros =  new ArrayList<>();
				        ((Aux2Context)_localctx).bloque =  ((Aux2Context)_localctx).blq.bloque;
				    
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

	public static class ListparamContext extends ParserRuleContext {
		public ArrayList<Parametro> lista;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public ListparamAuxContext listparamAux;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListparamAuxContext listparamAux() {
			return getRuleContext(ListparamAuxContext.class,0);
		}
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
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((ListparamContext)_localctx).type = type();
			setState(93);
			((ListparamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(94);
			((ListparamContext)_localctx).listparamAux = listparamAux();

			        ((ListparamContext)_localctx).lista =  new ArrayList<>();
			        Parametro param = new Parametro(((ListparamContext)_localctx).type.tipo, (((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null));
			        _localctx.lista.add(param);
			        _localctx.lista.addAll(((ListparamContext)_localctx).listparamAux.lista);
			    
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

	public static class ListparamAuxContext extends ParserRuleContext {
		public ArrayList<Parametro> lista;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public ListparamAuxContext listparamAux;
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListparamAuxContext listparamAux() {
			return getRuleContext(ListparamAuxContext.class,0);
		}
		public ListparamAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparamAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListparamAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListparamAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListparamAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamAuxContext listparamAux() throws RecognitionException {
		ListparamAuxContext _localctx = new ListparamAuxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listparamAux);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(COMA);
				setState(98);
				((ListparamAuxContext)_localctx).type = type();
				setState(99);
				((ListparamAuxContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(100);
				((ListparamAuxContext)_localctx).listparamAux = listparamAux();

				        ((ListparamAuxContext)_localctx).lista =  new ArrayList<>();
				        Parametro param = new Parametro(((ListparamAuxContext)_localctx).type.tipo, (((ListparamAuxContext)_localctx).IDENTIFICADOR!=null?((ListparamAuxContext)_localctx).IDENTIFICADOR.getText():null));
				        _localctx.lista.add(param);
				        _localctx.lista.addAll(((ListparamAuxContext)_localctx).listparamAux.lista);
				    
				}
				break;
			case CERRAR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{

				        ((ListparamAuxContext)_localctx).lista =  new ArrayList<>();
				    
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

	public static class TypeContext extends ParserRuleContext {
		public String tipo;
		public Token ENTERO;
		public Token REAL;
		public Token CARACTER;
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((TypeContext)_localctx).ENTERO = match(ENTERO);

				       ((TypeContext)_localctx).tipo =  (((TypeContext)_localctx).ENTERO!=null?((TypeContext)_localctx).ENTERO.getText():null);
				    
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				((TypeContext)_localctx).REAL = match(REAL);

				       ((TypeContext)_localctx).tipo =  (((TypeContext)_localctx).REAL!=null?((TypeContext)_localctx).REAL.getText():null);
				    
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((TypeContext)_localctx).CARACTER = match(CARACTER);

				       ((TypeContext)_localctx).tipo =  (((TypeContext)_localctx).CARACTER!=null?((TypeContext)_localctx).CARACTER.getText():null);
				    
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

	public static class BlqContext extends ParserRuleContext {
		public int indent;
		public Blq bloque;
		public SentlistContext sentlist;
		public TerminalNode INICIO() { return getToken(gramaticaParser.INICIO, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public BlqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlqContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
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

	public final BlqContext blq(int indent) throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState(), indent);
		enterRule(_localctx, 16, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(INICIO);
			setState(115);
			((BlqContext)_localctx).sentlist = sentlist(_localctx.indent);
			setState(116);
			match(FIN);

			        ArrayList<Sentencia> sentencias = new ArrayList<>();
			        sentencias = ((BlqContext)_localctx).sentlist.sentencias;
			        ((BlqContext)_localctx).bloque =  new Blq(((BlqContext)_localctx).sentlist.sentencias,_localctx.indent);
			    
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
		public int indent;
		public ArrayList<Sentencia> sentencias;
		public SentContext sent;
		public SentlistAuxContext sentlistAux;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
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

	public final SentlistContext sentlist(int indent) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), indent);
		enterRule(_localctx, 18, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((SentlistContext)_localctx).sent = sent(_localctx.indent+1);
			setState(120);
			((SentlistContext)_localctx).sentlistAux = sentlistAux(_localctx.indent+1);

			        ((SentlistContext)_localctx).sentencias =  new ArrayList<>();
			        _localctx.sentencias.add(((SentlistContext)_localctx).sent.sentencia);
			        _localctx.sentencias.addAll(((SentlistContext)_localctx).sentlistAux.sentencias);
			    
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

	public static class SentlistAuxContext extends ParserRuleContext {
		public int indent;
		public ArrayList<Sentencia> sentencias;
		public SentContext sent;
		public SentlistAuxContext sentlistAux;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
		}
		public SentlistAuxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistAuxContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_sentlistAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentlistAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentlistAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentlistAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistAuxContext sentlistAux(int indent) throws RecognitionException {
		SentlistAuxContext _localctx = new SentlistAuxContext(_ctx, getState(), indent);
		enterRule(_localctx, 20, RULE_sentlistAux);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CARACTER:
			case INICIO:
			case RETURN:
			case BIFURCACION:
			case BUCLEPARA:
			case BUCLEMIENTRAS:
			case BUCLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((SentlistAuxContext)_localctx).sent = sent(_localctx.indent);
				setState(124);
				((SentlistAuxContext)_localctx).sentlistAux = sentlistAux(_localctx.indent);

				        ((SentlistAuxContext)_localctx).sentencias =  new ArrayList<>();
				        _localctx.sentencias.add(((SentlistAuxContext)_localctx).sent.sentencia);
				        _localctx.sentencias.addAll(((SentlistAuxContext)_localctx).sentlistAux.sentencias);
				    
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 2);
				{

				        ((SentlistAuxContext)_localctx).sentencias =  new ArrayList<>();
				    
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

	public static class SentContext extends ParserRuleContext {
		public int indent;
		public Sentencia sentencia;
		public TypeContext type;
		public LidContext lid;
		public Token IDENTIFICADOR;
		public Aux3Context aux3;
		public Aux3PrimaContext aux3Prima;
		public ExpContext exp;
		public LcondContext lcond;
		public BlqContext blq1;
		public BlqContext blq2;
		public Token id1;
		public AsigContext asig1;
		public ExpContext exp1;
		public Token id2;
		public AsigContext asig2;
		public ExpContext exp2;
		public BlqContext blq;
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
		public Aux3Context aux3() {
			return getRuleContext(Aux3Context.class,0);
		}
		public Aux3PrimaContext aux3Prima() {
			return getRuleContext(Aux3PrimaContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(gramaticaParser.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BIFURCACION() { return getToken(gramaticaParser.BIFURCACION, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public TerminalNode ENTONCES() { return getToken(gramaticaParser.ENTONCES, 0); }
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode BUCLEPARA() { return getToken(gramaticaParser.BUCLEPARA, 0); }
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public TerminalNode BUCLEMIENTRAS() { return getToken(gramaticaParser.BUCLEMIENTRAS, 0); }
		public TerminalNode BUCLE() { return getToken(gramaticaParser.BUCLE, 0); }
		public TerminalNode HASTA() { return getToken(gramaticaParser.HASTA, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
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

	public final SentContext sent(int indent) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), indent);
		enterRule(_localctx, 22, RULE_sent);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((SentContext)_localctx).type = type();
				setState(131);
				((SentContext)_localctx).lid = lid();
				setState(132);
				match(PUNTO_Y_COMA);

				            String tipo = ((SentContext)_localctx).type.tipo;
				            ArrayList<Varios> lid = ((SentContext)_localctx).lid.identificadores;
				            ((SentContext)_localctx).sentencia =  new Declaracion(tipo,lid); //Declaracion extends Sentencia
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(136);
				((SentContext)_localctx).aux3 = aux3();

				            String ident = (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null);
				            String asig = ((SentContext)_localctx).aux3.asignacion;
				            ArrayList<Varios> aux3 = ((SentContext)_localctx).aux3.asignaciones;
				            ((SentContext)_localctx).sentencia =  new Asignacion(ident,asig,aux3); //Asignacion extends Sentencia
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(140);
				((SentContext)_localctx).aux3Prima = aux3Prima();

				            String ident = (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null);
				            ArrayList<Varios> aux3Pr = ((SentContext)_localctx).aux3Prima.funcion;
				            ((SentContext)_localctx).sentencia =  new LLamada(ident,aux3Pr); //Llamada extends Sentencia
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(RETURN);
				setState(144);
				((SentContext)_localctx).exp = exp();
				setState(145);
				match(PUNTO_Y_COMA);

				            ((SentContext)_localctx).sentencia =  new Return(((SentContext)_localctx).exp.expresion);//Return extends sentencia
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(BIFURCACION);
				setState(149);
				match(ABRIR_PARENTESIS);
				setState(150);
				((SentContext)_localctx).lcond = lcond();
				setState(151);
				match(CERRAR_PARENTESIS);
				setState(152);
				match(ENTONCES);
				setState(153);
				((SentContext)_localctx).blq1 = blq(_localctx.indent);
				setState(154);
				match(SINO);
				setState(155);
				((SentContext)_localctx).blq2 = blq(_localctx.indent);

				            ((SentContext)_localctx).sentencia =  new Bifurcacion(((SentContext)_localctx).lcond.listaConds,((SentContext)_localctx).blq1.bloque,((SentContext)_localctx).blq2.bloque);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(BUCLEPARA);
				setState(159);
				match(ABRIR_PARENTESIS);
				setState(160);
				((SentContext)_localctx).id1 = match(IDENTIFICADOR);
				setState(161);
				((SentContext)_localctx).asig1 = asig();
				setState(162);
				((SentContext)_localctx).exp1 = exp();
				setState(163);
				match(PUNTO_Y_COMA);
				setState(164);
				((SentContext)_localctx).lcond = lcond();
				setState(165);
				match(PUNTO_Y_COMA);
				setState(166);
				((SentContext)_localctx).id2 = match(IDENTIFICADOR);
				setState(167);
				((SentContext)_localctx).asig2 = asig();
				setState(168);
				((SentContext)_localctx).exp2 = exp();
				setState(169);
				match(CERRAR_PARENTESIS);
				setState(170);
				((SentContext)_localctx).blq = blq(_localctx.indent);

				            ((SentContext)_localctx).sentencia =  new BuclePara((((SentContext)_localctx).id1!=null?((SentContext)_localctx).id1.getText():null),((SentContext)_localctx).asig1.s,((SentContext)_localctx).exp1.expresion,((SentContext)_localctx).lcond.listaConds,(((SentContext)_localctx).id2!=null?((SentContext)_localctx).id2.getText():null),((SentContext)_localctx).asig2.s,((SentContext)_localctx).exp2.expresion,((SentContext)_localctx).blq.bloque);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(BUCLEMIENTRAS);
				setState(174);
				match(ABRIR_PARENTESIS);
				setState(175);
				lcond();
				setState(176);
				match(CERRAR_PARENTESIS);
				setState(177);
				blq(_localctx.indent);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(BUCLE);
				setState(180);
				blq(_localctx.indent);
				setState(181);
				match(HASTA);
				setState(182);
				match(ABRIR_PARENTESIS);
				setState(183);
				lcond();
				setState(184);
				match(CERRAR_PARENTESIS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				blq(_localctx.indent);
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

	public static class Aux3Context extends ParserRuleContext {
		public String asignacion;
		public ArrayList<Varios> asignaciones;
		public AsigContext asig;
		public ExpContext exp;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(gramaticaParser.PUNTO_Y_COMA, 0); }
		public Aux3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux3Context aux3() throws RecognitionException {
		Aux3Context _localctx = new Aux3Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_aux3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((Aux3Context)_localctx).asig = asig();
			setState(190);
			((Aux3Context)_localctx).exp = exp();
			setState(191);
			match(PUNTO_Y_COMA);

			        ((Aux3Context)_localctx).asignaciones =  new ArrayList<>();
			        ((Aux3Context)_localctx).asignacion =  ((Aux3Context)_localctx).asig.s;
			        _localctx.asignaciones.addAll(((Aux3Context)_localctx).exp.expresion);
			    
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

	public static class Aux3PrimaContext extends ParserRuleContext {
		public ArrayList<Varios> funcion;
		public Aux4Context aux4;
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public Aux4Context aux4() {
			return getRuleContext(Aux4Context.class,0);
		}
		public Aux3PrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux3Prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux3Prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux3Prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux3Prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux3PrimaContext aux3Prima() throws RecognitionException {
		Aux3PrimaContext _localctx = new Aux3PrimaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aux3Prima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ABRIR_PARENTESIS);
			setState(195);
			((Aux3PrimaContext)_localctx).aux4 = aux4();

			        ((Aux3PrimaContext)_localctx).funcion =  new ArrayList<>();
			        Otros otro = new Otros("(");
			        _localctx.funcion.add(otro);
			        _localctx.funcion.addAll(((Aux3PrimaContext)_localctx).aux4.ids);
			    
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

	public static class Aux4Context extends ParserRuleContext {
		public ArrayList<Varios> ids;
		public LidContext lid;
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(gramaticaParser.PUNTO_Y_COMA, 0); }
		public Aux4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux4Context aux4() throws RecognitionException {
		Aux4Context _localctx = new Aux4Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_aux4);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((Aux4Context)_localctx).lid = lid();
				setState(199);
				match(CERRAR_PARENTESIS);
				setState(200);
				match(PUNTO_Y_COMA);

				        ((Aux4Context)_localctx).ids =  new ArrayList<>();
				        _localctx.ids.addAll(((Aux4Context)_localctx).lid.identificadores);
				        Otros otro = new Otros(")");
				        _localctx.ids.add(otro);
				        otro = new Otros(";");
				        _localctx.ids.add(otro);
				    
				}
				break;
			case CERRAR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CERRAR_PARENTESIS);
				setState(204);
				match(PUNTO_Y_COMA);

				        ((Aux4Context)_localctx).ids =  new ArrayList<>();
				        Otros otro = new Otros(")");
				        _localctx.ids.add(otro);
				        otro = new Otros(";");
				        _localctx.ids.add(otro);
				    
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

	public static class LidContext extends ParserRuleContext {
		public ArrayList<Varios> identificadores;
		public Token IDENTIFICADOR;
		public Aux5Context aux5;
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public Aux5Context aux5() {
			return getRuleContext(Aux5Context.class,0);
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
		enterRule(_localctx, 30, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((LidContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(209);
			((LidContext)_localctx).aux5 = aux5();

			            ((LidContext)_localctx).identificadores =  new ArrayList<>();
			            Identificador ident = new Identificador((((LidContext)_localctx).IDENTIFICADOR!=null?((LidContext)_localctx).IDENTIFICADOR.getText():null));
			            _localctx.identificadores.add(ident); //lo añadimos al inicio del todo
			            _localctx.identificadores.addAll(((LidContext)_localctx).aux5.ids);
			        
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

	public static class Aux5Context extends ParserRuleContext {
		public ArrayList<Varios> ids;
		public LidContext lid;
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Aux5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux5Context aux5() throws RecognitionException {
		Aux5Context _localctx = new Aux5Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_aux5);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(COMA);
				setState(213);
				((Aux5Context)_localctx).lid = lid();

				            ((Aux5Context)_localctx).ids =  ((Aux5Context)_localctx).lid.identificadores;
				        
				}
				break;
			case CERRAR_PARENTESIS:
			case PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 2);
				{

				           //la primera que va a reconocer por recursividad, creamos la lista vacia
				           ((Aux5Context)_localctx).ids =  new ArrayList<>();
				        
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

	public static class AsigContext extends ParserRuleContext {
		public String s;
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
		enterRule(_localctx, 34, RULE_asig);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(IGUAL);

				        ((AsigContext)_localctx).s =  "=";
				    
				}
				break;
			case MAS_IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(MAS_IGUAL);

				        ((AsigContext)_localctx).s =  "+=";
				    
				}
				break;
			case MENOS_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(MENOS_IGUAL);

				        ((AsigContext)_localctx).s =  "-=";
				    
				}
				break;
			case POR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(POR_IGUAL);

				        ((AsigContext)_localctx).s =  "*=";
				    
				}
				break;
			case ENTRE_IGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(ENTRE_IGUAL);

				        ((AsigContext)_localctx).s =  "*=";
				    
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

	public static class ExpContext extends ParserRuleContext {
		public ArrayList<Varios> expresion;
		public Token IDENTIFICADOR;
		public Aux6Context aux6;
		public ExpAuxContext expAux;
		public ExpContext exp;
		public Token CONSTENTERO;
		public Token CONSTREAL;
		public Token CONSTLIT;
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public Aux6Context aux6() {
			return getRuleContext(Aux6Context.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public TerminalNode CONSTENTERO() { return getToken(gramaticaParser.CONSTENTERO, 0); }
		public TerminalNode CONSTREAL() { return getToken(gramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(gramaticaParser.CONSTLIT, 0); }
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((ExpContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(232);
				((ExpContext)_localctx).aux6 = aux6();
				setState(233);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        Identificador ident = new Identificador((((ExpContext)_localctx).IDENTIFICADOR!=null?((ExpContext)_localctx).IDENTIFICADOR.getText():null));
				        _localctx.expresion.add(ident);
				        _localctx.expresion.addAll(((ExpContext)_localctx).aux6.parametros);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case ABRIR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(ABRIR_PARENTESIS);
				setState(237);
				((ExpContext)_localctx).exp = exp();
				setState(238);
				match(CERRAR_PARENTESIS);
				setState(239);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        Otros otro = new Otros("(");
				        _localctx.expresion.add(otro);
				        _localctx.expresion.addAll(((ExpContext)_localctx).exp.expresion);
				        otro = new Otros(")");
				        _localctx.expresion.add(otro);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((ExpContext)_localctx).CONSTENTERO = match(CONSTENTERO);
				setState(243);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        Constante cons = new Constante((((ExpContext)_localctx).CONSTENTERO!=null?((ExpContext)_localctx).CONSTENTERO.getText():null));
				        _localctx.expresion.add(cons);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((ExpContext)_localctx).CONSTREAL = match(CONSTREAL);
				setState(247);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        Constante cons = new Constante((((ExpContext)_localctx).CONSTREAL!=null?((ExpContext)_localctx).CONSTREAL.getText():null));
				        _localctx.expresion.add(cons);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				((ExpContext)_localctx).CONSTLIT = match(CONSTLIT);
				setState(251);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        Constante cons = new Constante((((ExpContext)_localctx).CONSTLIT!=null?((ExpContext)_localctx).CONSTLIT.getText():null));
				        _localctx.expresion.add(cons);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
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

	public static class ExpAuxContext extends ParserRuleContext {
		public ArrayList<Varios> expresiones;
		public OpContext op;
		public ExpContext exp;
		public ExpAuxContext expAux;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAuxContext expAux() throws RecognitionException {
		ExpAuxContext _localctx = new ExpAuxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expAux);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((ExpAuxContext)_localctx).op = op();
				setState(257);
				((ExpAuxContext)_localctx).exp = exp();
				setState(258);
				((ExpAuxContext)_localctx).expAux = expAux();

				        ((ExpAuxContext)_localctx).expresiones =  new ArrayList<>();
				        Otros otro = new Otros(((ExpAuxContext)_localctx).op.operacion);
				        _localctx.expresiones.add(otro);
				        _localctx.expresiones.addAll(((ExpAuxContext)_localctx).exp.expresion);
				        _localctx.expresiones.addAll(((ExpAuxContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				        ((ExpAuxContext)_localctx).expresiones =  new ArrayList<>();
				    
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

	public static class Aux6Context extends ParserRuleContext {
		public ArrayList<Varios> parametros;
		public LidContext lid;
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode CERRAR_PARENTESIS() { return getToken(gramaticaParser.CERRAR_PARENTESIS, 0); }
		public Aux6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAux6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAux6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAux6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux6Context aux6() throws RecognitionException {
		Aux6Context _localctx = new Aux6Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_aux6);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(ABRIR_PARENTESIS);
				setState(265);
				((Aux6Context)_localctx).lid = lid();
				setState(266);
				match(CERRAR_PARENTESIS);

				        ((Aux6Context)_localctx).parametros =  new ArrayList<>();
				        Otros otro = new Otros("(");
				        _localctx.parametros.add(otro);
				        _localctx.parametros.addAll(((Aux6Context)_localctx).lid.identificadores);
				        otro = new Otros(")");
				        _localctx.parametros.add(otro);
				    
				}
				break;
			case CERRAR_PARENTESIS:
			case PUNTO_Y_COMA:
			case MAS:
			case MENOS:
			case MULTIPLICACION:
			case DIVISION:
			case Y:
			case O:
			case IGUAL_IGUAL:
			case DISTINTO:
			case MENOR:
			case MAYOR:
			case MAYOR_IGUAL:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 2);
				{

				        ((Aux6Context)_localctx).parametros =  new ArrayList<>();
				    
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

	public static class OpContext extends ParserRuleContext {
		public String operacion;
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
		enterRule(_localctx, 42, RULE_op);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(MAS);

				       ((OpContext)_localctx).operacion =  "+";
				    
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(MENOS);

				       ((OpContext)_localctx).operacion =  "-";
				    
				}
				break;
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(MULTIPLICACION);

				       ((OpContext)_localctx).operacion =  "*";
				    
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(DIVISION);

				       ((OpContext)_localctx).operacion =  "/";
				    
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

	public static class LcondContext extends ParserRuleContext {
		public String listaConds;
		public CondContext cond;
		public LcondAuxContext lcondAux;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LcondAuxContext lcondAux() {
			return getRuleContext(LcondAuxContext.class,0);
		}
		public TerminalNode NO() { return getToken(gramaticaParser.NO, 0); }
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
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lcond);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
			case CIERTO:
			case FALSO:
			case CONSTENTERO:
			case CONSTREAL:
			case IDENTIFICADOR:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((LcondContext)_localctx).cond = cond();
				setState(283);
				((LcondContext)_localctx).lcondAux = lcondAux();

				            ((LcondContext)_localctx).listaConds =  ((LcondContext)_localctx).cond.condicion.toString() + ((LcondContext)_localctx).lcondAux.listConds;
				        
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(NO);
				setState(287);
				((LcondContext)_localctx).cond = cond();

				            ((LcondContext)_localctx).listaConds =  "no" + ((LcondContext)_localctx).cond.condicion.toString();
				        
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

	public static class LcondAuxContext extends ParserRuleContext {
		public String listConds;
		public OplContext opl;
		public LcondContext lcond;
		public LcondAuxContext lcondAux;
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public LcondAuxContext lcondAux() {
			return getRuleContext(LcondAuxContext.class,0);
		}
		public LcondAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcondAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLcondAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLcondAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLcondAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondAuxContext lcondAux() throws RecognitionException {
		LcondAuxContext _localctx = new LcondAuxContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lcondAux);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				((LcondAuxContext)_localctx).opl = opl();
				setState(293);
				((LcondAuxContext)_localctx).lcond = lcond();
				setState(294);
				((LcondAuxContext)_localctx).lcondAux = lcondAux();

				            ((LcondAuxContext)_localctx).listConds =  ((LcondAuxContext)_localctx).opl.comlog + ((LcondAuxContext)_localctx).lcond.listaConds + ((LcondAuxContext)_localctx).lcondAux.listConds;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				            ((LcondAuxContext)_localctx).listConds =  "";
				        
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

	public static class CondContext extends ParserRuleContext {
		public Condicion condicion;
		public ExpContext e1;
		public OprContext opr;
		public ExpContext e2;
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		enterRule(_localctx, 48, RULE_cond);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
			case CONSTENTERO:
			case CONSTREAL:
			case IDENTIFICADOR:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				((CondContext)_localctx).e1 = exp();
				setState(301);
				((CondContext)_localctx).opr = opr();
				setState(302);
				((CondContext)_localctx).e2 = exp();

				            ((CondContext)_localctx).condicion =  new CondicionExpr(((CondContext)_localctx).e1.expresion,((CondContext)_localctx).opr.comparacion,((CondContext)_localctx).e2.expresion);
				        
				}
				break;
			case CIERTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(CIERTO);

				            ((CondContext)_localctx).condicion =  new CondicionLiteral("cierto");
				        
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(FALSO);

				            ((CondContext)_localctx).condicion =  new CondicionLiteral("falso");
				        
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
		public String comlog;
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
		enterRule(_localctx, 50, RULE_opl);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Y:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(Y);

				        ((OplContext)_localctx).comlog =  "y";
				    
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(O);

				        ((OplContext)_localctx).comlog =  "o";
				    
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

	public static class OprContext extends ParserRuleContext {
		public String comparacion;
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
		enterRule(_localctx, 52, RULE_opr);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(IGUAL_IGUAL);

				        ((OprContext)_localctx).comparacion =  "==";
				    
				}
				break;
			case DISTINTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(DISTINTO);

				        ((OprContext)_localctx).comparacion =  "<>";
				    
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(MENOR);

				        ((OprContext)_localctx).comparacion =  "<";
				    
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(MAYOR);

				        ((OprContext)_localctx).comparacion =  ">";
				    
				}
				break;
			case MAYOR_IGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(MAYOR_IGUAL);

				        ((OprContext)_localctx).comparacion =  ">=";
				    
				}
				break;
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				match(MENOR_IGUAL);

				         ((OprContext)_localctx).comparacion =  "<=";
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0083\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d1\n\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e8\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0109\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0111\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u011b\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0125\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u012d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0138\n"+
		"\32\3\33\3\33\3\33\3\33\5\33\u013e\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014c\n\34\3\34\2\2\35\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u015a\28\3\2\2"+
		"\2\4A\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16j\3\2\2\2"+
		"\20r\3\2\2\2\22t\3\2\2\2\24y\3\2\2\2\26\u0082\3\2\2\2\30\u00bd\3\2\2\2"+
		"\32\u00bf\3\2\2\2\34\u00c4\3\2\2\2\36\u00d0\3\2\2\2 \u00d2\3\2\2\2\"\u00db"+
		"\3\2\2\2$\u00e7\3\2\2\2&\u0100\3\2\2\2(\u0108\3\2\2\2*\u0110\3\2\2\2,"+
		"\u011a\3\2\2\2.\u0124\3\2\2\2\60\u012c\3\2\2\2\62\u0137\3\2\2\2\64\u013d"+
		"\3\2\2\2\66\u014b\3\2\2\289\5\6\4\29:\5\4\3\2:;\b\2\1\2;\3\3\2\2\2<=\5"+
		"\6\4\2=>\5\4\3\2>?\b\3\1\2?B\3\2\2\2@B\b\3\1\2A<\3\2\2\2A@\3\2\2\2B\5"+
		"\3\2\2\2CD\7\3\2\2DE\5\20\t\2EF\5\b\5\2FG\b\4\1\2GM\3\2\2\2HI\7\4\2\2"+
		"IJ\5\b\5\2JK\b\4\1\2KM\3\2\2\2LC\3\2\2\2LH\3\2\2\2M\7\3\2\2\2NO\7,\2\2"+
		"OP\7\5\2\2PQ\5\n\6\2QR\b\5\1\2R\t\3\2\2\2ST\5\f\7\2TU\7\6\2\2UV\5\22\n"+
		"\2VW\b\6\1\2W]\3\2\2\2XY\7\6\2\2YZ\5\22\n\2Z[\b\6\1\2[]\3\2\2\2\\S\3\2"+
		"\2\2\\X\3\2\2\2]\13\3\2\2\2^_\5\20\t\2_`\7,\2\2`a\5\16\b\2ab\b\7\1\2b"+
		"\r\3\2\2\2cd\7\16\2\2de\5\20\t\2ef\7,\2\2fg\5\16\b\2gh\b\b\1\2hk\3\2\2"+
		"\2ik\b\b\1\2jc\3\2\2\2ji\3\2\2\2k\17\3\2\2\2lm\7\7\2\2ms\b\t\1\2no\7\b"+
		"\2\2os\b\t\1\2pq\7\t\2\2qs\b\t\1\2rl\3\2\2\2rn\3\2\2\2rp\3\2\2\2s\21\3"+
		"\2\2\2tu\7\n\2\2uv\5\24\13\2vw\7\13\2\2wx\b\n\1\2x\23\3\2\2\2yz\5\30\r"+
		"\2z{\5\26\f\2{|\b\13\1\2|\25\3\2\2\2}~\5\30\r\2~\177\5\26\f\2\177\u0080"+
		"\b\f\1\2\u0080\u0083\3\2\2\2\u0081\u0083\b\f\1\2\u0082}\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\5\20\t\2\u0085\u0086\5 \21"+
		"\2\u0086\u0087\7\f\2\2\u0087\u0088\b\r\1\2\u0088\u00be\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a\u008b\5\32\16\2\u008b\u008c\b\r\1\2\u008c\u00be\3\2\2\2"+
		"\u008d\u008e\7,\2\2\u008e\u008f\5\34\17\2\u008f\u0090\b\r\1\2\u0090\u00be"+
		"\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\5&\24\2\u0093\u0094\7\f\2\2\u0094"+
		"\u0095\b\r\1\2\u0095\u00be\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\7"+
		"\5\2\2\u0098\u0099\5.\30\2\u0099\u009a\7\6\2\2\u009a\u009b\7\31\2\2\u009b"+
		"\u009c\5\22\n\2\u009c\u009d\7\32\2\2\u009d\u009e\5\22\n\2\u009e\u009f"+
		"\b\r\1\2\u009f\u00be\3\2\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7\5\2\2"+
		"\u00a2\u00a3\7,\2\2\u00a3\u00a4\5$\23\2\u00a4\u00a5\5&\24\2\u00a5\u00a6"+
		"\7\f\2\2\u00a6\u00a7\5.\30\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\7,\2\2\u00a9"+
		"\u00aa\5$\23\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\5\22"+
		"\n\2\u00ad\u00ae\b\r\1\2\u00ae\u00be\3\2\2\2\u00af\u00b0\7\34\2\2\u00b0"+
		"\u00b1\7\5\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\5\22"+
		"\n\2\u00b4\u00be\3\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\5\22\n\2\u00b7"+
		"\u00b8\7\36\2\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\5.\30\2\u00ba\u00bb\7"+
		"\6\2\2\u00bb\u00be\3\2\2\2\u00bc\u00be\5\22\n\2\u00bd\u0084\3\2\2\2\u00bd"+
		"\u0089\3\2\2\2\u00bd\u008d\3\2\2\2\u00bd\u0091\3\2\2\2\u00bd\u0096\3\2"+
		"\2\2\u00bd\u00a0\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\5&\24"+
		"\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\b\16\1\2\u00c3\33\3\2\2\2\u00c4\u00c5"+
		"\7\5\2\2\u00c5\u00c6\5\36\20\2\u00c6\u00c7\b\17\1\2\u00c7\35\3\2\2\2\u00c8"+
		"\u00c9\5 \21\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\b\20"+
		"\1\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\7\f\2\2\u00cf"+
		"\u00d1\b\20\1\2\u00d0\u00c8\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\37\3\2\2"+
		"\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\b\21\1\2\u00d5"+
		"!\3\2\2\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8\5 \21\2\u00d8\u00d9\b\22\1"+
		"\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\b\22\1\2\u00db\u00d6\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\u00e8\b\23\1"+
		"\2\u00df\u00e0\7\20\2\2\u00e0\u00e8\b\23\1\2\u00e1\u00e2\7\21\2\2\u00e2"+
		"\u00e8\b\23\1\2\u00e3\u00e4\7\22\2\2\u00e4\u00e8\b\23\1\2\u00e5\u00e6"+
		"\7\23\2\2\u00e6\u00e8\b\23\1\2\u00e7\u00dd\3\2\2\2\u00e7\u00df\3\2\2\2"+
		"\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8%\3"+
		"\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\5*\26\2\u00eb\u00ec\5(\25\2\u00ec"+
		"\u00ed\b\24\1\2\u00ed\u0101\3\2\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\5"+
		"&\24\2\u00f0\u00f1\7\6\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\b\24\1\2\u00f3"+
		"\u0101\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\b\24"+
		"\1\2\u00f7\u0101\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9\u00fa\5(\25\2\u00fa"+
		"\u00fb\b\24\1\2\u00fb\u0101\3\2\2\2\u00fc\u00fd\7.\2\2\u00fd\u00fe\5("+
		"\25\2\u00fe\u00ff\b\24\1\2\u00ff\u0101\3\2\2\2\u0100\u00e9\3\2\2\2\u0100"+
		"\u00ee\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0101\'\3\2\2\2\u0102\u0103\5,\27\2\u0103\u0104\5&\24\2\u0104\u0105"+
		"\5(\25\2\u0105\u0106\b\25\1\2\u0106\u0109\3\2\2\2\u0107\u0109\b\25\1\2"+
		"\u0108\u0102\3\2\2\2\u0108\u0107\3\2\2\2\u0109)\3\2\2\2\u010a\u010b\7"+
		"\5\2\2\u010b\u010c\5 \21\2\u010c\u010d\7\6\2\2\u010d\u010e\b\26\1\2\u010e"+
		"\u0111\3\2\2\2\u010f\u0111\b\26\1\2\u0110\u010a\3\2\2\2\u0110\u010f\3"+
		"\2\2\2\u0111+\3\2\2\2\u0112\u0113\7\24\2\2\u0113\u011b\b\27\1\2\u0114"+
		"\u0115\7\25\2\2\u0115\u011b\b\27\1\2\u0116\u0117\7\26\2\2\u0117\u011b"+
		"\b\27\1\2\u0118\u0119\7\27\2\2\u0119\u011b\b\27\1\2\u011a\u0112\3\2\2"+
		"\2\u011a\u0114\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2\2\2\u011b-"+
		"\3\2\2\2\u011c\u011d\5\62\32\2\u011d\u011e\5\60\31\2\u011e\u011f\b\30"+
		"\1\2\u011f\u0125\3\2\2\2\u0120\u0121\7\37\2\2\u0121\u0122\5\62\32\2\u0122"+
		"\u0123\b\30\1\2\u0123\u0125\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u0120\3"+
		"\2\2\2\u0125/\3\2\2\2\u0126\u0127\5\64\33\2\u0127\u0128\5.\30\2\u0128"+
		"\u0129\5\60\31\2\u0129\u012a\b\31\1\2\u012a\u012d\3\2\2\2\u012b\u012d"+
		"\b\31\1\2\u012c\u0126\3\2\2\2\u012c\u012b\3\2\2\2\u012d\61\3\2\2\2\u012e"+
		"\u012f\5&\24\2\u012f\u0130\5\66\34\2\u0130\u0131\5&\24\2\u0131\u0132\b"+
		"\32\1\2\u0132\u0138\3\2\2\2\u0133\u0134\7 \2\2\u0134\u0138\b\32\1\2\u0135"+
		"\u0136\7!\2\2\u0136\u0138\b\32\1\2\u0137\u012e\3\2\2\2\u0137\u0133\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\63\3\2\2\2\u0139\u013a\7\"\2\2\u013a\u013e"+
		"\b\33\1\2\u013b\u013c\7#\2\2\u013c\u013e\b\33\1\2\u013d\u0139\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\65\3\2\2\2\u013f\u0140\7$\2\2\u0140\u014c\b"+
		"\34\1\2\u0141\u0142\7%\2\2\u0142\u014c\b\34\1\2\u0143\u0144\7&\2\2\u0144"+
		"\u014c\b\34\1\2\u0145\u0146\7\'\2\2\u0146\u014c\b\34\1\2\u0147\u0148\7"+
		"(\2\2\u0148\u014c\b\34\1\2\u0149\u014a\7)\2\2\u014a\u014c\b\34\1\2\u014b"+
		"\u013f\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0145\3\2"+
		"\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c\67\3\2\2\2\25AL\\j"+
		"r\u0082\u00bd\u00d0\u00db\u00e7\u0100\u0108\u0110\u011a\u0124\u012c\u0137"+
		"\u013d\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}