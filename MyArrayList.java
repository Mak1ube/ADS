public class MyArrayList<T extends Comparable<T>>   implements Mylist<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    public void add(T element) {  // Метод добавляет элемент просто в конец
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length] = element;
        length++;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
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
            throw new IndexOutOfBoundsException("Индекс: " + index + " жок");
        }
    }

    public int size() {
        return length;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            elements[i] = null; // удаляем референс на все элементы
        }
        length = 0; // обнуляем количество элементов
    }

    public void set(int index, T value) {
        checkIndex(index);
        elements[index] = value;
    }

    @Override
    public void sort() {
        for(int i = 0; i < length - 1; i++){
            for(int j = 0; j < length - i - 1; j++){
                T current = (T) elements[j];
                T next = (T) elements[j+1];// Следуйщий с которым сравниваем

                if (current.compareTo(next) > 0) {
                    Object temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }


    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(object)) { // Сравнение Не ссылок а прям элементтин значениясы
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = length - 1; i >= 0; i--) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }


    @Override
    public Object[] toArray() {
        // Создаем Массив резалт
        Object[] result = new Object[length];
        // Каждый элемент с одного в другой
        for (int i = 0; i < length; i++) {
            result[i] = elements[i];
        }

        // Выводим
        return result;
    }

    @Override
    public void add(int index, T item) { // Добавления элемента но уже типа с выбором можно выбрать индекс
        //Проверка
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Индекс: " + index + "йок");
        }

        //Тут понятно
        if (length == elements.length) {
            increaseCapacity();
        }

        //Убираем элементы в одну сторону
        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        //Добавляем
        elements[index] = item;
        length++;
    }

    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }


    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(length - 1);
    }


    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(length - 1);
    }

}
