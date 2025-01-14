package Ast;

public class AtomNode extends ASTNode {
    private String value;

    public AtomNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value; // Add this method to retrieve the value of the atom
    }

    @Override
    public String prettyPrint(String indent) {
        return value + " ";
    }
}
