// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/AIS/Tema 3/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
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
		LINE_COMENT=43, MULTI_COMENT=44, CONSTLIT=45, WHITESPACE=46;
	public static final int
		RULE_program = 0, RULE_aux1 = 1, RULE_part = 2, RULE_restpart = 3, RULE_aux2 = 4, 
		RULE_listparam = 5, RULE_listparamAux = 6, RULE_type = 7, RULE_blq = 8, 
		RULE_sentlist = 9, RULE_sentlistAux = 10, RULE_sent = 11, RULE_aux3 = 12, 
		RULE_aux4 = 13, RULE_lid = 14, RULE_aux5 = 15, RULE_asig = 16, RULE_exp = 17, 
		RULE_expAux = 18, RULE_aux6 = 19, RULE_op = 20, RULE_lcond = 21, RULE_lcondAux = 22, 
		RULE_cond = 23, RULE_opl = 24, RULE_opr = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "aux1", "part", "restpart", "aux2", "listparam", "listparamAux", 
			"type", "blq", "sentlist", "sentlistAux", "sent", "aux3", "aux4", "lid", 
			"aux5", "asig", "exp", "expAux", "aux6", "op", "lcond", "lcondAux", "cond", 
			"opl", "opr"
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
			setState(52);
			((ProgramContext)_localctx).part = part();
			setState(53);
			((ProgramContext)_localctx).aux1 = aux1();

			        Program programa = new Program(((ProgramContext)_localctx).part.parte,((ProgramContext)_localctx).aux1.partes);
			        programa.toString();
			    
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((Aux1Context)_localctx).part = part();
				setState(57);
				aux1();

				        _localctx.partes.add(((Aux1Context)_localctx).part.parte);
				    
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(FUNCION);
				setState(64);
				((PartContext)_localctx).type = type();
				setState(65);
				((PartContext)_localctx).restpart = restpart();

				        String tipo = ((PartContext)_localctx).type.tipo;
				        ((PartContext)_localctx).parte =  new Funcion(((PartContext)_localctx).restpart.nombre,tipo,((PartContext)_localctx).restpart.variables,((PartContext)_localctx).restpart.sentencias);
				    
				}
				break;
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(PROCEDIMIENTO);
				setState(69);
				((PartContext)_localctx).restpart = restpart();

				        ((PartContext)_localctx).parte =  new Procedimiento(((PartContext)_localctx).restpart.nombre,((PartContext)_localctx).restpart.variables,((PartContext)_localctx).restpart.sentencias);
				    
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
		public ArrayList<Sentencia> sentencias;
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
			setState(74);
			((RestpartContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(75);
			match(ABRIR_PARENTESIS);
			setState(76);
			((RestpartContext)_localctx).aux2 = aux2();

			        ((RestpartContext)_localctx).nombre =  (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null);
			        ((RestpartContext)_localctx).variables =  ((RestpartContext)_localctx).aux2.parametros;
			        ((RestpartContext)_localctx).sentencias =  ((RestpartContext)_localctx).aux2.listaSent;
			    
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
		public ArrayList<Sentencia> listaSent;
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Aux2Context)_localctx).listparam = listparam();
				setState(80);
				match(CERRAR_PARENTESIS);
				setState(81);
				((Aux2Context)_localctx).blq = blq();

				        ((Aux2Context)_localctx).parametros =  ((Aux2Context)_localctx).listparam.lista;
				        ((Aux2Context)_localctx).listaSent =  ((Aux2Context)_localctx).blq.sentencias;
				    
				}
				break;
			case CERRAR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(CERRAR_PARENTESIS);
				setState(85);
				((Aux2Context)_localctx).blq = blq();

				        ((Aux2Context)_localctx).parametros =  new ArrayList<>(); //Tambien podemos poner puntero a null si da problemas al construir
				                                         //y así vemos que si la lista de params es null es que no tiene ninguno
				        ((Aux2Context)_localctx).listaSent =  ((Aux2Context)_localctx).blq.sentencias;
				    
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
			setState(90);
			((ListparamContext)_localctx).type = type();
			setState(91);
			((ListparamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(92);
			((ListparamContext)_localctx).listparamAux = listparamAux();

			        Parametro param = new Parametro(((ListparamContext)_localctx).type.tipo, (((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null));
			        ((ListparamContext)_localctx).listparamAux.lista.add(param);
			        ((ListparamContext)_localctx).lista =  ((ListparamContext)_localctx).listparamAux.lista;
			    
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(COMA);
				setState(96);
				((ListparamAuxContext)_localctx).type = type();
				setState(97);
				((ListparamAuxContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(98);
				listparamAux();

				        Parametro param = new Parametro(((ListparamAuxContext)_localctx).type.tipo, (((ListparamAuxContext)_localctx).IDENTIFICADOR!=null?((ListparamAuxContext)_localctx).IDENTIFICADOR.getText():null));
				        _localctx.lista.add(param); //no puedo probarlo porque no se compila aun
				                                    //Pero esto aunque tiene sentido, no se si funcionara
				                                    //Por ser la recursividad en una misma regla
				                                    //Quiero añadir el param a la lista que me pasa lo de abajo justo
				    
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((TypeContext)_localctx).ENTERO = match(ENTERO);

				       ((TypeContext)_localctx).tipo =  (((TypeContext)_localctx).ENTERO!=null?((TypeContext)_localctx).ENTERO.getText():null);
				    
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((TypeContext)_localctx).REAL = match(REAL);

				       ((TypeContext)_localctx).tipo =  (((TypeContext)_localctx).REAL!=null?((TypeContext)_localctx).REAL.getText():null);
				    
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
		public ArrayList<Sentencia> sentencias;
		public SentlistContext sentlist;
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
		enterRule(_localctx, 16, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INICIO);
			setState(113);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(114);
			match(FIN);

			        ((BlqContext)_localctx).sentencias =  ((BlqContext)_localctx).sentlist.sentencias;
			    
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
		public ArrayList<Sentencia> sentencias;
		public SentContext sent;
		public SentlistAuxContext sentlistAux;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
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
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((SentlistContext)_localctx).sent = sent();
			setState(118);
			((SentlistContext)_localctx).sentlistAux = sentlistAux();

			        Sentencia s = ((SentlistContext)_localctx).sent.sentencia;
			        ((SentlistContext)_localctx).sentlistAux.sentencias.add(s);
			        ((SentlistContext)_localctx).sentencias =  ((SentlistContext)_localctx).sentlistAux.sentencias;
			    
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
		public ArrayList<Sentencia> sentencias;
		public SentContext sent;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistAuxContext sentlistAux() {
			return getRuleContext(SentlistAuxContext.class,0);
		}
		public SentlistAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SentlistAuxContext sentlistAux() throws RecognitionException {
		SentlistAuxContext _localctx = new SentlistAuxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentlistAux);
		try {
			setState(126);
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
				setState(121);
				((SentlistAuxContext)_localctx).sent = sent();
				setState(122);
				sentlistAux();

				        _localctx.sentencias.add(((SentlistAuxContext)_localctx).sent.sentencia);
				    
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
		public Sentencia sentencia;
		public TypeContext type;
		public LidContext lid;
		public Token IDENTIFICADOR;
		public Aux3Context aux3;
		public ExpContext exp;
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
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
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
		enterRule(_localctx, 22, RULE_sent);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case REAL:
			case CARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((SentContext)_localctx).type = type();
				setState(129);
				((SentContext)_localctx).lid = lid();
				setState(130);
				match(PUNTO_Y_COMA);

				            String tipo = ((SentContext)_localctx).type.tipo;
				            ArrayList<String> lid = ((SentContext)_localctx).lid.identificadores;
				            ((SentContext)_localctx).sentencia =  new Declaracion(tipo,lid); //Declaracion extends Sentencia
				        
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(134);
				((SentContext)_localctx).aux3 = aux3();

				            String ident = (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null);
				            ArrayList<String> aux3 = ((SentContext)_localctx).aux3.asignacion;
				            ((SentContext)_localctx).sentencia =  new Asignacion(ident,aux3); //Asignacion extends Sentencia
				        
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(RETURN);
				setState(138);
				((SentContext)_localctx).exp = exp();
				setState(139);
				match(PUNTO_Y_COMA);

				            ((SentContext)_localctx).sentencia =  new Return(((SentContext)_localctx).exp.expresion);
				        
				}
				break;
			case BIFURCACION:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(BIFURCACION);
				setState(143);
				match(ABRIR_PARENTESIS);
				setState(144);
				lcond();
				setState(145);
				match(CERRAR_PARENTESIS);
				setState(146);
				match(ENTONCES);
				setState(147);
				blq();
				setState(148);
				match(SINO);
				setState(149);
				blq();
				}
				break;
			case BUCLEPARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(BUCLEPARA);
				setState(152);
				match(ABRIR_PARENTESIS);
				setState(153);
				match(IDENTIFICADOR);
				setState(154);
				asig();
				setState(155);
				exp();
				setState(156);
				match(PUNTO_Y_COMA);
				setState(157);
				lcond();
				setState(158);
				match(PUNTO_Y_COMA);
				setState(159);
				match(IDENTIFICADOR);
				setState(160);
				asig();
				setState(161);
				exp();
				setState(162);
				match(CERRAR_PARENTESIS);
				setState(163);
				blq();
				}
				break;
			case BUCLEMIENTRAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(BUCLEMIENTRAS);
				setState(166);
				match(ABRIR_PARENTESIS);
				setState(167);
				lcond();
				setState(168);
				match(CERRAR_PARENTESIS);
				setState(169);
				blq();
				}
				break;
			case BUCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(BUCLE);
				setState(172);
				blq();
				setState(173);
				match(HASTA);
				setState(174);
				match(ABRIR_PARENTESIS);
				setState(175);
				lcond();
				setState(176);
				match(CERRAR_PARENTESIS);
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				blq();
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

	public static class Aux3Context extends ParserRuleContext {
		public ArrayList<String> asignacion;
		public AsigContext asig;
		public ExpContext exp;
		public Aux4Context aux4;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(gramaticaParser.PUNTO_Y_COMA, 0); }
		public TerminalNode ABRIR_PARENTESIS() { return getToken(gramaticaParser.ABRIR_PARENTESIS, 0); }
		public Aux4Context aux4() {
			return getRuleContext(Aux4Context.class,0);
		}
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
			case MAS_IGUAL:
			case MENOS_IGUAL:
			case POR_IGUAL:
			case ENTRE_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((Aux3Context)_localctx).asig = asig();
				setState(182);
				((Aux3Context)_localctx).exp = exp();
				setState(183);
				match(PUNTO_Y_COMA);

				        ((Aux3Context)_localctx).asignacion =  new ArrayList<>();
				        _localctx.asignacion.add(((Aux3Context)_localctx).asig.s);
				        _localctx.asignacion.addAll(((Aux3Context)_localctx).exp.expresion);
				        _localctx.asignacion.add(";");
				    
				}
				break;
			case ABRIR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(ABRIR_PARENTESIS);
				setState(187);
				((Aux3Context)_localctx).aux4 = aux4();

				        ((Aux3Context)_localctx).asignacion =  new ArrayList<>();
				        _localctx.asignacion.add("(");
				        _localctx.asignacion.addAll(((Aux3Context)_localctx).aux4.ids);
				    
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

	public static class Aux4Context extends ParserRuleContext {
		public ArrayList<String> ids;
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
		enterRule(_localctx, 26, RULE_aux4);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((Aux4Context)_localctx).lid = lid();
				setState(193);
				match(CERRAR_PARENTESIS);
				setState(194);
				match(PUNTO_Y_COMA);

				        ((Aux4Context)_localctx).ids =  new ArrayList<>();
				        _localctx.ids.addAll(((Aux4Context)_localctx).lid.identificadores);
				        _localctx.ids.add(")");
				        _localctx.ids.add(";");
				    
				}
				break;
			case CERRAR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(CERRAR_PARENTESIS);
				setState(198);
				match(PUNTO_Y_COMA);

				        ((Aux4Context)_localctx).ids =  new ArrayList<>();
				        _localctx.ids.add(")");
				        _localctx.ids.add(";");
				    
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
		public ArrayList<String> identificadores;
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
		enterRule(_localctx, 28, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((LidContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(203);
			((LidContext)_localctx).aux5 = aux5();

			            ((LidContext)_localctx).aux5.ids.add(0,(((LidContext)_localctx).IDENTIFICADOR!=null?((LidContext)_localctx).IDENTIFICADOR.getText():null)); //lo añadimos al inicio del todo
			            ((LidContext)_localctx).identificadores =  ((LidContext)_localctx).aux5.ids;
			        
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
		public ArrayList<String> ids;
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
		enterRule(_localctx, 30, RULE_aux5);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(COMA);
				setState(207);
				((Aux5Context)_localctx).lid = lid();

				            ((Aux5Context)_localctx).ids =  ((Aux5Context)_localctx).lid.identificadores;
				        
				}
				break;
			case CERRAR_PARENTESIS:
			case PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 2);
				{

				           //la primera que va a reconocer por recursividad, creamos la lista vacia
				           ((Aux5Context)_localctx).ids =  new ArrayList<String>();
				        
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
		enterRule(_localctx, 32, RULE_asig);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IGUAL);

				        ((AsigContext)_localctx).s =  "=";
				    
				}
				break;
			case MAS_IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(MAS_IGUAL);

				        ((AsigContext)_localctx).s =  "+=";
				    
				}
				break;
			case MENOS_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(MENOS_IGUAL);

				        ((AsigContext)_localctx).s =  "-=";
				    
				}
				break;
			case POR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(POR_IGUAL);

				        ((AsigContext)_localctx).s =  "*=";
				    
				}
				break;
			case ENTRE_IGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
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
		public ArrayList<String> expresion;
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
		enterRule(_localctx, 34, RULE_exp);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((ExpContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(226);
				((ExpContext)_localctx).aux6 = aux6();
				setState(227);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        _localctx.expresion.add((((ExpContext)_localctx).IDENTIFICADOR!=null?((ExpContext)_localctx).IDENTIFICADOR.getText():null));
				        _localctx.expresion.addAll(((ExpContext)_localctx).aux6.parametros);
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case ABRIR_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ABRIR_PARENTESIS);
				setState(231);
				((ExpContext)_localctx).exp = exp();
				setState(232);
				match(CERRAR_PARENTESIS);
				setState(233);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        _localctx.expresion.add("(");
				        _localctx.expresion.addAll(((ExpContext)_localctx).exp.expresion);
				        _localctx.expresion.add(")");
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				((ExpContext)_localctx).CONSTENTERO = match(CONSTENTERO);
				setState(237);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        _localctx.expresion.add((((ExpContext)_localctx).CONSTENTERO!=null?((ExpContext)_localctx).CONSTENTERO.getText():null));
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				((ExpContext)_localctx).CONSTREAL = match(CONSTREAL);
				setState(241);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        _localctx.expresion.add((((ExpContext)_localctx).CONSTREAL!=null?((ExpContext)_localctx).CONSTREAL.getText():null));
				        _localctx.expresion.addAll(((ExpContext)_localctx).expAux.expresiones);
				    
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				((ExpContext)_localctx).CONSTLIT = match(CONSTLIT);
				setState(245);
				((ExpContext)_localctx).expAux = expAux();

				        ((ExpContext)_localctx).expresion =  new ArrayList<>();
				        _localctx.expresion.add((((ExpContext)_localctx).CONSTLIT!=null?((ExpContext)_localctx).CONSTLIT.getText():null));
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
		public ArrayList<String> expresiones;
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
		enterRule(_localctx, 36, RULE_expAux);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((ExpAuxContext)_localctx).op = op();
				setState(251);
				((ExpAuxContext)_localctx).exp = exp();
				setState(252);
				((ExpAuxContext)_localctx).expAux = expAux();

				        _localctx.expresiones.add(((ExpAuxContext)_localctx).op.operacion);
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
		public ArrayList<String> parametros;
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
		enterRule(_localctx, 38, RULE_aux6);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ABRIR_PARENTESIS);
				setState(259);
				((Aux6Context)_localctx).lid = lid();
				setState(260);
				match(CERRAR_PARENTESIS);

				        ((Aux6Context)_localctx).parametros =  new ArrayList<>();
				        _localctx.parametros.add("(");
				        _localctx.parametros.addAll(((Aux6Context)_localctx).lid.identificadores);
				        _localctx.parametros.add(")");
				    
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
		enterRule(_localctx, 40, RULE_op);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(MAS);

				       ((OpContext)_localctx).operacion =  "+";
				    
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(MENOS);

				       ((OpContext)_localctx).operacion =  "-";
				    
				}
				break;
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(MULTIPLICACION);

				       ((OpContext)_localctx).operacion =  "*";
				    
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
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
		enterRule(_localctx, 42, RULE_lcond);
		try {
			setState(281);
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
				setState(276);
				cond();
				setState(277);
				lcondAux();
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(NO);
				setState(280);
				cond();
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
		enterRule(_localctx, 44, RULE_lcondAux);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				opl();
				setState(284);
				lcond();
				setState(285);
				lcondAux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 46, RULE_cond);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRIR_PARENTESIS:
			case CONSTENTERO:
			case CONSTREAL:
			case IDENTIFICADOR:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				exp();
				setState(291);
				opr();
				setState(292);
				exp();
				}
				break;
			case CIERTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(CIERTO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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
		enterRule(_localctx, 48, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		enterRule(_localctx, 50, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c1\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00e2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00fb\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u010b\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0115\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u011c\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u012b\n\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\"#\3\2$)\2\u0138\2\66"+
		"\3\2\2\2\4?\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16h\3"+
		"\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24w\3\2\2\2\26\u0080\3\2\2\2\30\u00b5\3"+
		"\2\2\2\32\u00c0\3\2\2\2\34\u00ca\3\2\2\2\36\u00cc\3\2\2\2 \u00d5\3\2\2"+
		"\2\"\u00e1\3\2\2\2$\u00fa\3\2\2\2&\u0102\3\2\2\2(\u010a\3\2\2\2*\u0114"+
		"\3\2\2\2,\u011b\3\2\2\2.\u0122\3\2\2\2\60\u012a\3\2\2\2\62\u012c\3\2\2"+
		"\2\64\u012e\3\2\2\2\66\67\5\6\4\2\678\5\4\3\289\b\2\1\29\3\3\2\2\2:;\5"+
		"\6\4\2;<\5\4\3\2<=\b\3\1\2=@\3\2\2\2>@\b\3\1\2?:\3\2\2\2?>\3\2\2\2@\5"+
		"\3\2\2\2AB\7\3\2\2BC\5\20\t\2CD\5\b\5\2DE\b\4\1\2EK\3\2\2\2FG\7\4\2\2"+
		"GH\5\b\5\2HI\b\4\1\2IK\3\2\2\2JA\3\2\2\2JF\3\2\2\2K\7\3\2\2\2LM\7,\2\2"+
		"MN\7\5\2\2NO\5\n\6\2OP\b\5\1\2P\t\3\2\2\2QR\5\f\7\2RS\7\6\2\2ST\5\22\n"+
		"\2TU\b\6\1\2U[\3\2\2\2VW\7\6\2\2WX\5\22\n\2XY\b\6\1\2Y[\3\2\2\2ZQ\3\2"+
		"\2\2ZV\3\2\2\2[\13\3\2\2\2\\]\5\20\t\2]^\7,\2\2^_\5\16\b\2_`\b\7\1\2`"+
		"\r\3\2\2\2ab\7\16\2\2bc\5\20\t\2cd\7,\2\2de\5\16\b\2ef\b\b\1\2fi\3\2\2"+
		"\2gi\b\b\1\2ha\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jk\7\7\2\2kq\b\t\1\2lm\7\b"+
		"\2\2mq\b\t\1\2no\7\t\2\2oq\b\t\1\2pj\3\2\2\2pl\3\2\2\2pn\3\2\2\2q\21\3"+
		"\2\2\2rs\7\n\2\2st\5\24\13\2tu\7\13\2\2uv\b\n\1\2v\23\3\2\2\2wx\5\30\r"+
		"\2xy\5\26\f\2yz\b\13\1\2z\25\3\2\2\2{|\5\30\r\2|}\5\26\f\2}~\b\f\1\2~"+
		"\u0081\3\2\2\2\177\u0081\b\f\1\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\5\20\t\2\u0083\u0084\5\36\20\2\u0084\u0085\7\f"+
		"\2\2\u0085\u0086\b\r\1\2\u0086\u00b6\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\5\32\16\2\u0089\u008a\b\r\1\2\u008a\u00b6\3\2\2\2\u008b\u008c\7"+
		"\r\2\2\u008c\u008d\5$\23\2\u008d\u008e\7\f\2\2\u008e\u008f\b\r\1\2\u008f"+
		"\u00b6\3\2\2\2\u0090\u0091\7\30\2\2\u0091\u0092\7\5\2\2\u0092\u0093\5"+
		",\27\2\u0093\u0094\7\6\2\2\u0094\u0095\7\31\2\2\u0095\u0096\5\22\n\2\u0096"+
		"\u0097\7\32\2\2\u0097\u0098\5\22\n\2\u0098\u00b6\3\2\2\2\u0099\u009a\7"+
		"\33\2\2\u009a\u009b\7\5\2\2\u009b\u009c\7,\2\2\u009c\u009d\5\"\22\2\u009d"+
		"\u009e\5$\23\2\u009e\u009f\7\f\2\2\u009f\u00a0\5,\27\2\u00a0\u00a1\7\f"+
		"\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\5$\23\2\u00a4"+
		"\u00a5\7\6\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00b6\3\2\2\2\u00a7\u00a8\7"+
		"\34\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5,\27\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\u00b6\3\2\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\5"+
		"\22\n\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\5,\27\2\u00b2"+
		"\u00b3\7\6\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5\22\n\2\u00b5\u0082\3"+
		"\2\2\2\u00b5\u0087\3\2\2\2\u00b5\u008b\3\2\2\2\u00b5\u0090\3\2\2\2\u00b5"+
		"\u0099\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\5$\23\2\u00b9\u00ba"+
		"\7\f\2\2\u00ba\u00bb\b\16\1\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\7\5\2\2"+
		"\u00bd\u00be\5\34\17\2\u00be\u00bf\b\16\1\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b7\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\5\36\20"+
		"\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\b\17\1\2\u00c6"+
		"\u00cb\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00cb\b\17"+
		"\1\2\u00ca\u00c2\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd"+
		"\7,\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\b\20\1\2\u00cf\37\3\2\2\2\u00d0"+
		"\u00d1\7\16\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\b\21\1\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d6\b\21\1\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6!\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00e2\b\22\1\2\u00d9\u00da"+
		"\7\20\2\2\u00da\u00e2\b\22\1\2\u00db\u00dc\7\21\2\2\u00dc\u00e2\b\22\1"+
		"\2\u00dd\u00de\7\22\2\2\u00de\u00e2\b\22\1\2\u00df\u00e0\7\23\2\2\u00e0"+
		"\u00e2\b\22\1\2\u00e1\u00d7\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3"+
		"\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e4"+
		"\7,\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\b\23\1\2\u00e7"+
		"\u00fb\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7\6"+
		"\2\2\u00eb\u00ec\5&\24\2\u00ec\u00ed\b\23\1\2\u00ed\u00fb\3\2\2\2\u00ee"+
		"\u00ef\7*\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f1\b\23\1\2\u00f1\u00fb\3\2"+
		"\2\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\b\23\1\2\u00f5"+
		"\u00fb\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9\b\23"+
		"\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00e3\3\2\2\2\u00fa\u00e8\3\2\2\2\u00fa"+
		"\u00ee\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb%\3\2\2\2"+
		"\u00fc\u00fd\5*\26\2\u00fd\u00fe\5$\23\2\u00fe\u00ff\5&\24\2\u00ff\u0100"+
		"\b\24\1\2\u0100\u0103\3\2\2\2\u0101\u0103\b\24\1\2\u0102\u00fc\3\2\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\'\3\2\2\2\u0104\u0105\7\5\2\2\u0105\u0106\5"+
		"\36\20\2\u0106\u0107\7\6\2\2\u0107\u0108\b\25\1\2\u0108\u010b\3\2\2\2"+
		"\u0109\u010b\b\25\1\2\u010a\u0104\3\2\2\2\u010a\u0109\3\2\2\2\u010b)\3"+
		"\2\2\2\u010c\u010d\7\24\2\2\u010d\u0115\b\26\1\2\u010e\u010f\7\25\2\2"+
		"\u010f\u0115\b\26\1\2\u0110\u0111\7\26\2\2\u0111\u0115\b\26\1\2\u0112"+
		"\u0113\7\27\2\2\u0113\u0115\b\26\1\2\u0114\u010c\3\2\2\2\u0114\u010e\3"+
		"\2\2\2\u0114\u0110\3\2\2\2\u0114\u0112\3\2\2\2\u0115+\3\2\2\2\u0116\u0117"+
		"\5\60\31\2\u0117\u0118\5.\30\2\u0118\u011c\3\2\2\2\u0119\u011a\7\37\2"+
		"\2\u011a\u011c\5\60\31\2\u011b\u0116\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"-\3\2\2\2\u011d\u011e\5\62\32\2\u011e\u011f\5,\27\2\u011f\u0120\5.\30"+
		"\2\u0120\u0123\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\5$\23\2\u0125\u0126\5\64\33\2\u0126"+
		"\u0127\5$\23\2\u0127\u012b\3\2\2\2\u0128\u012b\7 \2\2\u0129\u012b\7!\2"+
		"\2\u012a\u0124\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\61"+
		"\3\2\2\2\u012c\u012d\t\2\2\2\u012d\63\3\2\2\2\u012e\u012f\t\3\2\2\u012f"+
		"\65\3\2\2\2\24?JZhp\u0080\u00b5\u00c0\u00ca\u00d5\u00e1\u00fa\u0102\u010a"+
		"\u0114\u011b\u0122\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}