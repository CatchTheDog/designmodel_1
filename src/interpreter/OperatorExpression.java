package interpreter;

public abstract class OperatorExpression extends ArithmenticExpression {
    protected ArithmenticExpression arithmenticExpression1,arithmenticExpression2;

    public OperatorExpression(ArithmenticExpression arithmenticExpression1, ArithmenticExpression arithmenticExpression2) {
        this.arithmenticExpression1 = arithmenticExpression1;
        this.arithmenticExpression2 = arithmenticExpression2;
    }
}
