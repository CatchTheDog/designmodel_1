package factorymethod;

public class StaticFactory {
    private StaticFactory(){}
    public static Food getA(){ return new A();};
    public static Food getB(){ return new B();}
    public static Food getC(){ return new C();}
}
