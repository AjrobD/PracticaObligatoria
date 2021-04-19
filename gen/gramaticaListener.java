// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/Procesadores de Lenguajes/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#help1}.
	 * @param ctx the parse tree
	 */
	void enterHelp1(gramaticaParser.Help1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#help1}.
	 * @param ctx the parse tree
	 */
	void exitHelp1(gramaticaParser.Help1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(gramaticaParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(gramaticaParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restpart}.
	 * @param ctx the parse tree
	 */
	void enterRestpart(gramaticaParser.RestpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restpart}.
	 * @param ctx the parse tree
	 */
	void exitRestpart(gramaticaParser.RestpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listparam}.
	 * @param ctx the parse tree
	 */
	void enterListparam(gramaticaParser.ListparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listparam}.
	 * @param ctx the parse tree
	 */
	void exitListparam(gramaticaParser.ListparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(gramaticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(gramaticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#lid}.
	 * @param ctx the parse tree
	 */
	void enterLid(gramaticaParser.LidContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#lid}.
	 * @param ctx the parse tree
	 */
	void exitLid(gramaticaParser.LidContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#lcond}.
	 * @param ctx the parse tree
	 */
	void enterLcond(gramaticaParser.LcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#lcond}.
	 * @param ctx the parse tree
	 */
	void exitLcond(gramaticaParser.LcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(gramaticaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(gramaticaParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opl}.
	 * @param ctx the parse tree
	 */
	void enterOpl(gramaticaParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opl}.
	 * @param ctx the parse tree
	 */
	void exitOpl(gramaticaParser.OplContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(gramaticaParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(gramaticaParser.OprContext ctx);
}