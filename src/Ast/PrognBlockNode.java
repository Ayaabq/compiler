package Ast;

import java.util.ArrayList;
import java.util.List;

public class PrognBlockNode extends ASTNode {
    private List<ASTNode> body = new ArrayList<>();

    public void addBody(ASTNode statement) {
        body.add(statement);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("PrognBlock:\n");
        for (ASTNode stmt : body) {
            sb.append(stmt.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}
