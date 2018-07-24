package templatemethod;

public class A extends Cook {
    @Override
    public void pourVegetable() {
        System.out.println("pourVegetable a");
    }

    @Override
    public void pourSauce() {
        System.out.println("pourSauce a");
    }
}
