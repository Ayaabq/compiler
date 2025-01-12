package Ast;

public class AtomNode extends ASTNode {
    private String value;

    public AtomNode(String value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent +  value;
    }
}
