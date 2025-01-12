// Generated from C:/Users/ASUS/Desktop/compiler/src/Grammar/LispParser.g4 by ANTLR 4.13.1
package Grammar;
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
	 * Visit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LispParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LispParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#variable_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(LispParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LispParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(LispParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LispParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LispParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#escaped_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_char(LispParser.Escaped_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_content(LispParser.String_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(LispParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LispParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LispParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(LispParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(LispParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_content(LispParser.Format_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_directive(LispParser.Format_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(LispParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#progn_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgn_block(LispParser.Progn_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#structure_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_definition(LispParser.Structure_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#make_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake_structure(LispParser.Make_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(LispParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(LispParser.Return_statementContext ctx);
}