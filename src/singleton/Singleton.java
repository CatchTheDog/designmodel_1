package singleton;

public class Singleton {
    private Singleton(){}
    public static class SingletonBuild {
      private static Singleton value = new Singleton();
    }
    public Singleton getInstance(){return SingletonBuild.value;}
}
