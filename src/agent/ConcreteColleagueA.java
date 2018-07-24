package agent;

public class ConcreteColleagueA extends Colleague {
    public void notifyColleagueB(){
        mediator.notifyColleagueB();
    }
    @Override
    public void operation() {
        System.out.println("this is ConcreteColleagueA's operation");
    }
}
