package visitor;

public class VisitorPatterDemo {
    public static void main(String [] args){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
