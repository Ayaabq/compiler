package Ast;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {
    private List<ASTNode> statements = new ArrayList<>();

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Program:\n");
        for (ASTNode stmt : statements) {
            sb.append(stmt.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}
