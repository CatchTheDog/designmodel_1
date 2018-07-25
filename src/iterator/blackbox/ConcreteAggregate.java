package iterator.blackbox;

public class ConcreteAggregate extends Aggregate {

    private Object [] objects;

    public ConcreteAggregate(Object [] objects){
        this.objects = objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator{
        private int index = 0;
        private int size = 0;

        public ConcreteIterator() {
            this.index = 0;
            this.size = objects.length;
        }

        @Override
        public void moveToFirst() {
               index = 0;
        }

        @Override
        public void moveToNext() {
           index ++;
        }

        @Override
        public boolean isLast() {
            return index >= size;
        }

        @Override
        public Object getCurrentItem() {
            return objects[index];
        }
    }
}
