package patterns.behavioral.iterator;

public interface MyIterator<E> {
    E next();
    E current();
    boolean hasNext();
}
