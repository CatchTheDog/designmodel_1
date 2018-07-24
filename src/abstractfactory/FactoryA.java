package abstractfactory;

public class FactoryA implements Produce {
    @Override
    public Food get() {
        return new A();
    }
}
