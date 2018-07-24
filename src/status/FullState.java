package status;

public class FullState implements DispenserState {
    @Override
    public void press() {
        System.out.println("Water is pouring");
    }
}
