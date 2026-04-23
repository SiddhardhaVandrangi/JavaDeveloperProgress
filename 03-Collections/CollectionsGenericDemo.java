import java.util.ArrayList;

/**
 * Demonstrates Generics and Type Safety in Collections
 * - Generics prevent ClassCastException
 * - Compile-time type checking
 */
public class CollectionsGenericDemo {
    public static void main(String[] args) {
        // Example 1: Type-safe String list
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("AI");
        courses.add("DevOps");
        
        System.out.println("String courses:");
        for (String course : courses) {
            System.out.println(course.toUpperCase());
        }
        
        // Example 2: Type-safe Integer list
        System.out.println("\nInteger list:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(44);
        numbers.add(45);
        numbers.add(46);
        System.out.println(numbers);
        
        // Generics prevent adding wrong type
        // numbers.add("String"); // Compile error - type safe
    }
}
