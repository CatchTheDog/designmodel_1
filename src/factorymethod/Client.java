package factorymethod;

public class Client {
    public void get(String name){
        Food x = null;
        if(name.equals("A")) x= StaticFactory.getA();
        else if(name.equals("B")) x =StaticFactory.getB();
        else x = StaticFactory.getC();
    }
}
