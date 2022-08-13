package ss11_stack_queue.e2_queue_use_circular_linked_list;

import java.util.TreeMap;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Solution solution = new Solution();

        solution.enQueue(queue, 1);
        solution.enQueue(queue, 2);
        solution.enQueue(queue, 3);

        solution.deQueue(queue);
        solution.deQueue(queue);
//        solution.deQueue(queue);
//        solution.deQueue(queue);


        solution.displayQueue(queue);
    }
}
