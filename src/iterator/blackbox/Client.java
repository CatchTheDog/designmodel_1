package iterator.blackbox;


public class Client {
    public void operation(){
        Object [] objects = {"a","b","c","d","e","f"};
        Aggregate agg = new ConcreteAggregate(objects);
        Iterator it = agg.createIterator();
        while (!it.isLast()){
            System.out.println(it.getCurrentItem());
            it.moveToNext();
        }
    }

    public static void main(String [] args){
        Client client = new Client();
        client.operation();
    }
}
