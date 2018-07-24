package facade;

public class Facade {
    private C c = new C();
    private D d = new D();
    public void a(){
        c.sayA();
        d.sayB();
    }
}
