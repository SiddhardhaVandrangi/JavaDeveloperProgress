import java.text.NumberFormat;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        float ar = (input.nextFloat() / 100) / 12;
        System.out.print("Period in years: ");
        int py = input.nextInt() * 12;
        float ars = (float) Math.pow(ar + 1, py);
        float result = principal * ((ar * ars) / (ars - 1));
        String result1=NumberFormat.getCurrencyInstance().format(result);
        System.out.println("the value is " + result1);
        
        input.close(); // Close the Scanner
    }
}
