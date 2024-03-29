package test;

public class MyStack<E> {
    private static final int INITIAL_SIZE = 16;
    private E[] elements;
    private int count = 0;

    public MyStack() {
        elements = (E[])
                new Object[INITIAL_SIZE];
    }

    public void push(E e) {
        ensureCapacity();
        elements[count++] = e;
    }

    private void ensureCapacity() {
        if (count >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements =
                    newElements;
        }
    }

    public E pop() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        E e = elements[count - 1];
        elements[count - 1] = null;
        count--;
        return e;
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("America");
        stack.push("Canada");
        stack.push("France");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}