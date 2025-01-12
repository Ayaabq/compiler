package Ast;

import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
    private List<ASTNode> elements = new ArrayList<>();

    public void addElement(ASTNode element) {
        elements.add(element);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("List:\n");
        for (ASTNode element : elements) {
            if (element != null) {
                sb.append(element.prettyPrint(indent + "    ")).append("\n");
            } else {
                sb.append(indent + "    null element\n"); // Handle the null element gracefully
            }
        }
        return sb.toString().trim();
    }


}
