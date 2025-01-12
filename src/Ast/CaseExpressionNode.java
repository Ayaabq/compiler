package Ast;

import java.util.ArrayList;
import java.util.List;

public class CaseExpressionNode extends ASTNode {
    private ASTNode caseExpression;
    private List<ASTNode> clauses = new ArrayList<>();

    public CaseExpressionNode(ASTNode caseExpression) {
        this.caseExpression = caseExpression;
    }

    public void addClause(ASTNode clause) {
        clauses.add(clause);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CaseExpression:\n");
        sb.append(indent).append("    Case: ").append(caseExpression.prettyPrint(indent + "    ")).append("\n");
        for (ASTNode clause : clauses) {
            sb.append(clause.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}
