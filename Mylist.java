public interface Mylist<T> {
        void add(T element);
        void remove(int index);
        T get(int index);
        int size();
}
