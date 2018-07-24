package responsibilitychain;

public class ConcreteHandlerA extends AbstractHandler{
    @Override
    public void handleRequest(String condition) {
        if("A".equals(condition)){
            System.out.println("ConcreteHandlerA处理");
        }else{
            System.out.println("ConcreteHandlerA不处理，由其他的Handler处理");
            super.getHandler().handleRequest(condition);
        }
    }
}
