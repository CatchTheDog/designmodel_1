package responsibilitychain;

public abstract class AbstractHandler {
    private AbstractHandler handler;
    public abstract void handleRequest(String condition);
    public AbstractHandler getHandler(){
        return this.handler;
    }
    public void setHandler(AbstractHandler handler){
        this.handler = handler;
    }
}
