package proxy.staticproxy;

public class Proxy implements Source {
    private Source source = new OldClass();
    private void doSomething(){
        System.out.println("doSomethidng");
    }

    public Proxy(Source source) {
        this.source = source;
    }

    @Override
    public void a() {
        doSomething();
        source.a();
    }
}
