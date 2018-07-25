package iterator.whitebox;

public interface Iterator {
    void moveToFirst();
    void moveToNext();
    boolean isLast();
    Object getCurrentItem();
}
