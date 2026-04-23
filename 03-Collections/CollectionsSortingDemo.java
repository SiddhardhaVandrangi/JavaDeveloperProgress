import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates Collections utility methods
 * - Sorting lists
 * - Frequency counting
 */
public class CollectionsSortingDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("SpringBoot");
        courses.add("SystemDesign");
        courses.add("AI Engineering");
        courses.add("DevOps");
        
        System.out.println("Original list: " + courses);
        
        // Count frequency of an element
        int frequency = Collections.frequency(courses, "Java");
        System.out.println("Frequency of 'Java': " + frequency);
        
        // Sort the list
        Collections.sort(courses);
        System.out.println("Sorted list: " + courses);
        
        // Shuffle the list (uncomment to see random order)
        // Collections.shuffle(courses);
        // System.out.println("Shuffled list: " + courses);
    }
}
