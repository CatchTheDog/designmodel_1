package adapter.objectadapter;

public class D implements A {
    private C c;

    public D(C c) {
        this.c = c;
    }

    @Override
    public boolean isA() {
        return c.isB();
    }
}
