import java.util.*;

public class PriorityStructures {
    public static void main(String[] args) {
        // Stack using PriorityQueue (LIFO)
        PriorityQueue<Integer> stack = new PriorityQueue<>(Comparator.reverseOrder());
        stack.addAll(Arrays.asList(1, 2, 3, 4));
        while (!stack.isEmpty()) {
            System.out.println("Stack Pop: " + stack.poll());
        }

        // Queue using PriorityQueue (FIFO)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());
        queue.addAll(Arrays.asList(4, 3, 2, 1));
        while (!queue.isEmpty()) {
            System.out.println("Queue Poll: " + queue.poll());
        }
    }
}
