// Generated from C:/Users/ASUS/Desktop/compiler/src/Grammar/LispParser.g4 by ANTLR 4.13.1
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LispParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LispParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LispParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(LispParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(LispParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LispParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LispParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LispParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LispParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#escaped_char}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_char(LispParser.Escaped_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#escaped_char}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_char(LispParser.Escaped_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#string_content}.
	 * @param ctx the parse tree
	 */
	void enterString_content(LispParser.String_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#string_content}.
	 * @param ctx the parse tree
	 */
	void exitString_content(LispParser.String_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LispParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LispParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LispParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LispParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LispParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LispParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(LispParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(LispParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void enterFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void exitFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterDestination(LispParser.DestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitDestination(LispParser.DestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_content}.
	 * @param ctx the parse tree
	 */
	void enterFormat_content(LispParser.Format_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_content}.
	 * @param ctx the parse tree
	 */
	void exitFormat_content(LispParser.Format_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_directive}.
	 * @param ctx the parse tree
	 */
	void enterFormat_directive(LispParser.Format_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_directive}.
	 * @param ctx the parse tree
	 */
	void exitFormat_directive(LispParser.Format_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(LispParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(LispParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#progn_block}.
	 * @param ctx the parse tree
	 */
	void enterProgn_block(LispParser.Progn_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#progn_block}.
	 * @param ctx the parse tree
	 */
	void exitProgn_block(LispParser.Progn_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#structure_definition}.
	 * @param ctx the parse tree
	 */
	void enterStructure_definition(LispParser.Structure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#structure_definition}.
	 * @param ctx the parse tree
	 */
	void exitStructure_definition(LispParser.Structure_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#make_structure}.
	 * @param ctx the parse tree
	 */
	void enterMake_structure(LispParser.Make_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#make_structure}.
	 * @param ctx the parse tree
	 */
	void exitMake_structure(LispParser.Make_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(LispParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(LispParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(LispParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(LispParser.Return_statementContext ctx);
}