// Generated from LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#lisp_}.
	 * @param ctx the parse tree
	 */
	void enterLisp_(LispParser.Lisp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lisp_}.
	 * @param ctx the parse tree
	 */
	void exitLisp_(LispParser.Lisp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LispParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LispParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LispParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LispParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LispParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(LispParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(LispParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#condClause}.
	 * @param ctx the parse tree
	 */
	void enterCondClause(LispParser.CondClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#condClause}.
	 * @param ctx the parse tree
	 */
	void exitCondClause(LispParser.CondClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LispParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LispParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(LispParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(LispParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(LispParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(LispParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(LispParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(LispParser.LogicalContext ctx);
}