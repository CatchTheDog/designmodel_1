package agent;

public class ConcreteColleagueB extends Colleague {
    public void notifyColleagueA(){
        mediator.notifyColleagueA();
    }
    @Override
    public void operation() {
        System.out.println("this is ConcreteColleagueB's operation");
    }
}
