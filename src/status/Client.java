package status;

public class Client {
    public static void main(String [] args){
        WaterDispenser dispenser = new WaterDispenser(new FullState());
        for(int i = 0;i<100;i++){
            dispenser.press();
        }
    }
}
