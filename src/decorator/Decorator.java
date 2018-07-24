package decorator;

public class Decorator implements Source {
    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }
    private void decorate_1(){
        System.out.println("decorate");
    }

    @Override
    public void a() {
        decorate_1();
        source.a();
    }
}
