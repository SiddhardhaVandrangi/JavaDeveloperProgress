import java.util.ArrayList;

/**
 * Demonstrates ArrayList operations and basic functionality
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // Example 1: Integer ArrayList with basic operations
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(20);
        al1.add(30);
        al1.add(1, 44);  // Insert at index 1
        System.out.println("Integer ArrayList: " + al1);
        
        // Example 2: String ArrayList with merge operations
        ArrayList al2 = new ArrayList();
        al2.add("Learning");
        al2.add("Java");
        al2.add("DevOps");
        System.out.println("String ArrayList: " + al2);
        
        // Merge both lists
        al2.addAll(al1);
        System.out.println("After merge: " + al2);
    }
}
