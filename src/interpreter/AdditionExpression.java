package interpreter;

public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmenticExpression arithmenticExpression1, ArithmenticExpression arithmenticExpression2) {
        super(arithmenticExpression1, arithmenticExpression2);
    }

    @Override
    public int interpret() {
        return arithmenticExpression1.interpret()+arithmenticExpression2.interpret();
    }
}
