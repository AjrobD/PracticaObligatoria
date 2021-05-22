// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/AIS/Tema 3/PracticaObligatoria/src\gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux1(gramaticaParser.Aux1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(gramaticaParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(gramaticaParser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux2(gramaticaParser.Aux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam(gramaticaParser.ListparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listparamAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparamAux(gramaticaParser.ListparamAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(gramaticaParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(gramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentlistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistAux(gramaticaParser.SentlistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(gramaticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux3(gramaticaParser.Aux3Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux4(gramaticaParser.Aux4Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid(gramaticaParser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux5(gramaticaParser.Aux5Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(gramaticaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAux(gramaticaParser.ExpAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aux6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux6(gramaticaParser.Aux6Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(gramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#lcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond(gramaticaParser.LcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#lcondAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcondAux(gramaticaParser.LcondAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(gramaticaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(gramaticaParser.OplContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(gramaticaParser.OprContext ctx);
}