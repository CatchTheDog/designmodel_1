package command;

/**
 * 命令的请求者
 */
public class Invoker {
    private ICommand command = null;

    public void setCommand(ICommand command){
       this.command = command;
    }

    public void runCommand(){
        command.execute();
    }
}
