package Ast;

import java.util.ArrayList;
import java.util.List;

public class CaseExpressionNode extends ASTNode {
    private ASTNode caseExpression; // The expression to evaluate
    private List<CaseClauseNode> clauses = new ArrayList<>(); // List of case clauses

    public CaseExpressionNode(ASTNode caseExpression) {
        this.caseExpression = caseExpression;
    }

    public void addClause(CaseClauseNode clause) {
        clauses.add(clause);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CaseExpression:\n");
        sb.append(indent).append("    Case: ").append(caseExpression.prettyPrint(indent + "    ")).append("\n");



        // Now iterate over the clauses to find the matched one in the visitor
        for (CaseClauseNode clause : clauses) {
//            sb.append(indent).append("    Clause:\n");
//            sb.append(clause.prettyPrint(indent + "    ")); // Print the clause
            sb.append(indent).append("    Matched Clause:\n");
            sb.append(clause.prettyPrint(indent + "    "));
            // Check if the condition is met in the visitor

        }



        return sb.toString().trim();
    }

    private Object evaluateExpression(ASTNode node) {
        if (node instanceof AtomNode) {
            return ((AtomNode) node).getValue();
        } else if (node instanceof OperationNode) {
            return ((OperationNode) node).getResult();
        }
        return null;
    }
}
