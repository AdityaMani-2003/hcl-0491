
package Collections;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);
        System.out.println("Top element: " + pq.peek());
        System.out.println("Removed element: " + pq.poll());
        System.out.println("After poll: " + pq);
        System.out.println("Size: " + pq.size());
        System.out.println("Is empty: " + pq.isEmpty());
        System.out.println("Contains 30: " + pq.contains(30));

        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
