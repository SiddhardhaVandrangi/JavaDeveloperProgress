import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demonstrates Vector and thread-safe collection access patterns
 * - Vector: Legacy synchronized list
 * - CopyOnWriteArrayList: Fail-safe collection
 * - Shows Iterator and Enumeration usage
 */
public class VectorAccessDemo {
    public static void main(String[] args) {
        // Example 1: CopyOnWriteArrayList (Fail-Safe)
        System.out.println("=== CopyOnWriteArrayList Example ===");
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add("Learning");
        al.add("Java");
        al.add("AWS");
        al.add("DevOps");
        al.add("System Design");
        
        String element = (String) al.get(3);
        System.out.println("Element at index 3: " + element);
        System.out.println("CopyOnWriteArrayList: " + al);
        
        // Example 2: Vector with Iterator and Enumeration
        System.out.println("\n=== Vector Example ===");
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.addElement(30);
        v.addElement(40);
        
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Using Enumeration (legacy)
        System.out.println("\nUsing Enumeration:");
        Enumeration enu = v.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
