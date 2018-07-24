package abstractfactory;

public class Client {
    public Food get(){
        return new FactoryA().get();
    }
}
