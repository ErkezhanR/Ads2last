public interface MyArrayList<T> {
    int size();
    boolean contains(Object o);
    void add (int index, T item);
    T get(int index);
    T remove(int index);
    int size() {
        return size;
    }
}

