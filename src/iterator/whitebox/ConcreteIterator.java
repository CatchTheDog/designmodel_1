package iterator.whitebox;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate cag;

    private int index = 0;

    private int size = 0;

    public ConcreteIterator(ConcreteAggregate cag) {
        this.cag = cag;
        this.size = cag.size();
        index = 0;
    }

    @Override
    public void moveToFirst() {
       index = 0;
    }

    @Override
    public void moveToNext() {
       if(index < size){
           index ++;
       }
    }

    @Override
    public boolean isLast() {
        return index >= size;
    }

    @Override
    public Object getCurrentItem() {
        return cag.getElement(index);
    }
}
