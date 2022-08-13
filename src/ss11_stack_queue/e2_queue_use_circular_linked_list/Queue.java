package ss11_stack_queue.e2_queue_use_circular_linked_list;

public class Queue<T> {
    private Node front;
    private Node rear;

    public Queue () {
    }

    public Queue(T value) {
        this.front = new Node(value);
        this.rear = front;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
