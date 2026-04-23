import java.util.PriorityQueue;

/**
 * Demonstrates PriorityQueue operations
 * - Implements min-heap data structure
 * - Elements are ordered by priority
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();  // Min-heap
        
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        pq.add(175);  // Duplicates allowed
        
        System.out.println("PriorityQueue (min-heap): " + pq);
        
        // Peek at top element without removing
        System.out.println("Peek (top element): " + pq.peek());
        
        // Add new element
        pq.offer(200);
        System.out.println("After offer(200): " + pq);
        
        // Poll removes and returns top element
        System.out.println("Poll (remove and return): " + pq.poll());
        System.out.println("After poll: " + pq);
    }
}
