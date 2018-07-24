package decorator;

public class Client {
    public static void main(String [] args){
        Decorator d = new Decorator(new B());
        d.a();
    }
}
