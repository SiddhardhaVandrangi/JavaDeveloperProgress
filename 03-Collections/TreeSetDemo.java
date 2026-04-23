import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * Demonstrates TreeSet operations
 * - Maintains elements in sorted order
 * - Uses Red-Black Tree algorithm internally
 * - No duplicates allowed
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        
        System.out.println("TreeSet (sorted order): " + ts);
        System.out.println("Size: " + ts.size());
        
        // Convert to ArrayList for iteration
        ArrayList al = new ArrayList();
        al.addAll(ts);
        
        // Iterate backwards from index 3
        System.out.println("\nIterating backwards from index 3:");
        ListIterator itr = al.listIterator(3);
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        
        // Navigation methods
        System.out.println("\nNavigation methods:");
        System.out.println("Higher than 50: " + ts.higher(50));
        System.out.println("Lower than 50: " + ts.lower(50));
        System.out.println("Ceiling of 65: " + ts.ceiling(65));
        System.out.println("Floor of 65: " + ts.floor(65));
    }
}
