package templatemethod;

public class B extends Cook {
    @Override
    public void pourVegetable() {
        System.out.println("pourVegetable b");
    }

    @Override
    public void pourSauce() {
        System.out.println("pourSauce b");
    }
}
