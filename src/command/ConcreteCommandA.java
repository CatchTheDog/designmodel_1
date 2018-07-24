package command;

/**
 * 具体的命令执行者
 */
public class ConcreteCommandA implements ICommand
{
    private Receiver receiver = null;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.sayHello();
    }
}
