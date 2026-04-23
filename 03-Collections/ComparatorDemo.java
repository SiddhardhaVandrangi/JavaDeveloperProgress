import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Demonstrates Comparator interface for custom sorting
 * - Comparator allows external sorting logic
 * - Can sort by different attributes dynamically
 */
class Player {
    int age;
    String name;
    double average;
    
    public Player(int age, String name, double average) {
        this.age = age;
        this.name = name;
        this.average = average;
    }
    
    @Override
    public String toString() {
        return "Player [age=" + age + ", name=" + name + ", average=" + average + "]";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(34, "SKY", 56.4));
        players.add(new Player(33, "Sanju", 65.4));
        players.add(new Player(35, "Dubey", 64.4));
        
        System.out.println("Original list: " + players);
        
        // Method 1: Sort by average (highest first) using Comparator class
        System.out.println("\n--- Sorted by Average ---");
        Collections.sort(players, (p1, p2) -> Double.compare(p2.average, p1.average));
        players.forEach(System.out::println);
        
        // Method 2: Sort by age using Lambda
        System.out.println("\n--- Sorted by Age ---");
        Collections.sort(players, (p1, p2) -> p1.age - p2.age);
        players.forEach(System.out::println);
        
        // Method 3: Sort by name
        System.out.println("\n--- Sorted by Name ---");
        Collections.sort(players, Comparator.comparing(p -> p.name));
        players.forEach(System.out::println);
    }
}
