package interpreter;

import java.util.Stack;

public class Calculator {
    protected Stack<ArithmenticExpression> arithmenticExpressions = new Stack<>();

    public Calculator(String expression) {
        ArithmenticExpression arithmenticExpression1,arithmenticExpression2;
        String [] elements = expression.split(" ");
        for(int i =0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    arithmenticExpression1 = arithmenticExpressions.pop();
                    arithmenticExpression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    arithmenticExpressions.push(new AdditionExpression(arithmenticExpression1,arithmenticExpression2));
                    break;
                default:
                    arithmenticExpressions.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;


            }
        }
    }

    public int calculate(){
        return arithmenticExpressions.pop().interpret();
    }
}
