package iterator.blackbox;

public interface Iterator {
    void moveToFirst();
    void moveToNext();
    boolean isLast();
    Object getCurrentItem();
}
