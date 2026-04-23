import java.util.LinkedHashSet;

/**
 * Demonstrates HashSet/LinkedHashSet operations
 * - No duplicates allowed
 * - LinkedHashSet maintains insertion order
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // Using LinkedHashSet to maintain insertion order
        LinkedHashSet set = new LinkedHashSet();
        set.add(44);
        set.add(45);
        set.add(56);
        set.add(34);
        set.add(54);
        set.add(43);
        set.add(43);  // Duplicate - will not be added
        
        System.out.println("LinkedHashSet (maintains insertion order): " + set);
        System.out.println("Size: " + set.size());
        
        // Check membership
        System.out.println("Contains 45: " + set.contains(45));
        System.out.println("Contains 100: " + set.contains(100));
    }
}
