package interpreter;

public class Client {
    public static void main(String [] args){
        Calculator calculator = new Calculator("123 + 123 + 4353 + 5454");
        System.out.println(calculator.calculate());
    }
}
