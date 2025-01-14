package Ast;

import java.util.List;

public class CaseClauseNode extends ASTNode {
    private List<ASTNode> conditions; // List of conditions for this clause
    private List<ASTNode> statements; // Statements to execute if conditions match

    public CaseClauseNode(List<ASTNode> conditions, List<ASTNode> statements) {
        this.conditions = conditions;
        this.statements = statements;
    }

    // Getter for conditions
    public List<ASTNode> getConditions() {
        return conditions;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
//        sb.append(indent).append("Conditions:\n");
//        for (ASTNode condition : conditions) {
//            sb.append(condition.prettyPrint(indent + "        ")).append("\n");
//        }
        sb.append(indent).append("Statements:\n");
        for (ASTNode statement : statements) {
            sb.append(statement.prettyPrint(indent + "        ")).append("\n");
        }
        return sb.toString().trim();
    }
}
