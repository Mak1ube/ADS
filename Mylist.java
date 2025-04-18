public interface Mylist<T> {
        void add(T element);
        void remove(int index);
        T get(int index);
        int size();
        void set (int index, T item);
        void add (int index, T item);
        void addFirst (T item);
        void addLast (T item);
        T getFirst ();
        T getLast ();
        void removeFirst ();
        void removeLast ();
        void clear();
        void sort();
        int indexOf (Object object);
        int lastIndexOf (Object object);
        boolean exists (Object object);
        public Object[] toArray();
}
