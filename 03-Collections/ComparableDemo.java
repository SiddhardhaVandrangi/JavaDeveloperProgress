import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates Comparable interface for natural sorting
 * - Comparable allows objects to define their natural order
 * - compareTo() method must be implemented in the class
 */
class Athlete implements Comparable<Athlete> {
    int age;
    String name;
    double average;
    
    public Athlete(int age, String name, double average) {
        this.age = age;
        this.name = name;
        this.average = average;
    }
    
    @Override
    public String toString() {
        return "Athlete [age=" + age + ", name=" + name + ", average=" + average + "]";
    }
    
    @Override
    public int compareTo(Athlete other) {
        // Sort by average in descending order
        if (this.average > other.average)
            return -1;  // this comes before other
        else if (this.average < other.average)
            return 1;   // other comes before this
        else
            return 0;   // equal
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(34, "SKY", 56.4));
        athletes.add(new Athlete(33, "Sanju", 65.4));
        athletes.add(new Athlete(35, "Dubey", 64.4));
        
        System.out.println("Original list: " + athletes);
        
        // Sort using natural order defined in compareTo()
        Collections.sort(athletes);
        
        System.out.println("Sorted by average (Comparable): " + athletes);
    }
}
