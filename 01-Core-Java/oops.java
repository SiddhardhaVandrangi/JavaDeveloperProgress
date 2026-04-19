import java.util.Scanner;

class SimpleCalculator {
    public int add(int s, int r) {
        return s + r;
    }
}

public class oops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 5;
        System.out.println("enter the big value");
        int b = input.nextInt();
        SimpleCalculator calc = new SimpleCalculator();
        int result = calc.add(a, b);
        System.out.println("The result is: " + result);
        
        input.close(); // Close the Scanner to prevent resource leaks
    }    
}
