// Generated from LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#lisp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisp_(LispParser.Lisp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LispParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LispParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(LispParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#condClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondClause(LispParser.CondClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LispParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(LispParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(LispParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(LispParser.LogicalContext ctx);
}