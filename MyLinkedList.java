public class MyLinkedList<T> implements Mylist<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T item) {
        checkIndexForAdd(index);
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode current = getNode(index);
            MyNode newNode = new MyNode(item);
            MyNode previous = current.prev;

            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = current;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (size == 0) throw new RuntimeException("Пустой");
        return head.data;
    }

    @Override
    public T getLast() {
        if (size == 0) throw new RuntimeException("пустой");
        return tail.data;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        getNode(index).data = item;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        MyNode toRemove = getNode(index);

        if (toRemove.prev != null) toRemove.prev.next = toRemove.next;
        else head = toRemove.next;

        if (toRemove.next != null) toRemove.next.prev = toRemove.prev;
        else tail = toRemove.prev;

        size--;
    }

    @Override
    public void removeFirst() {
        if (size == 0) throw new RuntimeException("List is empty");
        remove(0);
    }

    @Override
    public void removeLast() {
        if (size == 0) throw new RuntimeException("List is empty");
        remove(size - 1);
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void sort() {
        // To be implemented
    }

    @Override
    public int indexOf(Object object) {
        // To be implemented
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        // To be implemented
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        // To be implemented
        return false;
    }

    @Override
    public Object[] toArray() {
        // To be implemented
        return new Object[0];
    }

    @Override
    public int size() {
        return size;
    }

    private MyNode getNode(int index) {
        checkIndex(index);
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }
}
