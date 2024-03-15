package seminar_4.gb_collections;

public interface GbList<T> extends Iterable<T> {
    
    void add(T value);

    void add(T value, int index);

    T get(int index);

    void remove(T value);

    void remove(int index);

    int size();

}
