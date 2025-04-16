public class MyArrayList<T> implements Mylist<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    public void add(T element) {
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length++] = element;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i]; //upcasting
        }
        elements = newElements;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index]; //downcasting
    }

    public void remove(int index){
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[length - 1] = null; // удаляем дубликат последнего
        length--;
    }

    private void checkIndex(int index){
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
        }
    }

    public int size() {
        return length;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            elements[i] = null; // удаляем ссылки на все элементы
        }
        length = 0; // обнуляем количество элементов
    }

    public void set(int index, T value) {
        checkIndex(index);
        elements[index] = value;
    }

}