package abstractfactory;

public class FactoryB implements Produce {
    @Override
    public Food get() {
        return new B();
    }
}
