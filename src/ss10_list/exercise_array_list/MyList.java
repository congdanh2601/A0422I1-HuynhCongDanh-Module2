package ss10_list.exercise_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        E[] elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        E[] elements = (E[]) new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        if (size - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        E temp = (E) elements[index];
        if (size - 1 - index >= 0)
            System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        E[] clone = Arrays.copyOf(elements, elements.length);
        return clone;
    }

    public boolean contains(E o) {
        for (Object element : elements) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) return i;
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(elements.length * 2);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

}
