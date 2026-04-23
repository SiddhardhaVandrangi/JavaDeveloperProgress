import java.util.LinkedList;

/**
 * Demonstrates LinkedList operations - Doubly Linked List
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(40);  // Duplicates allowed
        ll.add(2, 44);  // Insert at index 2
        System.out.println("LinkedList: " + ll);
        
        System.out.println("Size: " + ll.size());
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());
    }
}
