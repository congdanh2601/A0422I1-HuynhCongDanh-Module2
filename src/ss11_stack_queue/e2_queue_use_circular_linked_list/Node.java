package ss11_stack_queue.e2_queue_use_circular_linked_list;

public class Node<T> {
    private T data;
    private Node link;

    public Node(T value) {
        data = value;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
