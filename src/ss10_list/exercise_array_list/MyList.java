package ss10_list.exercise_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        if (elements.length - 1 - index >= 0)
            System.arraycopy(elements, index, elements, index + 1, elements.length - 1 - index);
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        if (elements.length - 1 - index >= 0)
            System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        elements[elements.length - 1] = null;
        size--;
        return temp;
    }

    public int size() {

    }
}
