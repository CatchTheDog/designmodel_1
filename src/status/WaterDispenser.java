package status;

public class WaterDispenser {
    private static int capacity = 20;
    private static DispenserState dispenserState;

    public WaterDispenser(DispenserState state) {
        this.dispenserState = state;
    }

    public static DispenserState getState() {
        return dispenserState;
    }

    public static void setState(DispenserState dispenserState) {
        WaterDispenser.dispenserState = dispenserState;
    }

    public void press(){
        capacity--;
        if(capacity<=0){
            setState(new NullState());
        }
        dispenserState.press();
    }
}
