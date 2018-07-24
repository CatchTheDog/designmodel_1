package responsibilitychain;

public class ConcreteHandlerB extends AbstractHandler {
    public void handleRequest(String condition){
        if("B".equals(condition)){
            System.out.println("ConcreteHandlerB处理");
        }else{
            System.out.println("ConcreteHandlerB不处理，由其他的Handler处理");
            super.getHandler().handleRequest(condition);
        }

    }
}
