import java.util.ArrayDeque;

/**
 * Demonstrates ArrayDeque operations - Double-ended Queue
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add(200);
        System.out.println("Initial deque: " + ad);
        
        ad.add(300);
        System.out.println("After add(300): " + ad);
        
        ad.addFirst(400);  // Add at beginning
        System.out.println("After addFirst(400): " + ad);
        
        ad.add("Learning");
        ad.add(45.5);
        ad.add(4);
        ad.add(4);
        System.out.println("Final deque: " + ad);
        
        // Remove operations
        System.out.println("First element (removeFirst): " + ad.removeFirst());
        System.out.println("After removal: " + ad);
    }
}
