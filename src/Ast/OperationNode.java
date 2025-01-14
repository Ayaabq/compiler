package Ast;

public class OperationNode extends ASTNode {
    private String operator;
    private ASTNode left;
    private ASTNode right;
    private Object result; // Store the calculated result

    public OperationNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
        this.result = calculateResult(); // Automatically calculate the result when the node is created
    }

    public String getOperator() {
        return operator; // Getter for the operator
    }

    public ASTNode getLeft() {
        return left; // Getter for the left operand
    }

    public ASTNode getRight() {
        return right; // Getter for the right operand
    }

    public Object getResult() {
        return result; // Getter for the result
    }

    // Calculate the result based on the operator and operands
    private Object calculateResult() {
        Object leftValue = evaluateExpression(left);
        Object rightValue = evaluateExpression(right);

        switch (operator) {
            case "+":
                return Integer.parseInt(leftValue.toString()) + Integer.parseInt(rightValue.toString());
            case "-":
                return Integer.parseInt(leftValue.toString()) - Integer.parseInt(rightValue.toString());
            case "*":

                return Integer.parseInt(leftValue.toString()) * Integer.parseInt(rightValue.toString());
            case "/":
                int denominator = Integer.parseInt(rightValue.toString());
                if (denominator == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return Integer.parseInt(leftValue.toString()) / denominator;
            case "<":
                return Integer.parseInt(leftValue.toString()) < Integer.parseInt(rightValue.toString());
            case ">":
                return Integer.parseInt(leftValue.toString()) > Integer.parseInt(rightValue.toString());
            case "<=":
                return Integer.parseInt(leftValue.toString()) <= Integer.parseInt(rightValue.toString());
            case ">=":
                return Integer.parseInt(leftValue.toString()) >= Integer.parseInt(rightValue.toString());
            case "==":
            case "=":
                return Integer.parseInt(leftValue.toString()) == Integer.parseInt(rightValue.toString());
            case "and":
                return Boolean.parseBoolean(leftValue.toString()) && Boolean.parseBoolean(rightValue.toString());
            case "or":
                return Boolean.parseBoolean(leftValue.toString()) || Boolean.parseBoolean(rightValue.toString());
            default:
                throw new UnsupportedOperationException("Operator " + operator + " is not supported.");
        }
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();

        // Include the result in the pretty print
        sb.append(indent).append(result);

        return sb.toString();
    }

    private Object evaluateExpression(ASTNode node) {
        if (node instanceof AtomNode) {
            return ((AtomNode) node).getValue();
        } else if (node instanceof OperationNode) {
            OperationNode operation = (OperationNode) node;
            return operation.getResult(); // Get the result from the nested operation node
        }
        return null;
    }
}
