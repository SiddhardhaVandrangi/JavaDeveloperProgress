import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int age=24;
        int n =input.nextInt();
        String day;
        day=n==1?"Monday":"Not Monday";
        int[] numbers={1,3,5,2};
        double result=((double)4/(double)3);
        int[][] doubleone=new int[3][3];
        doubleone[2][1]=8;
        String message="Siddhu"+"oK";
        boolean check=message.endsWith("oK");
        Date now=new Date();
        System.out.println("Siddhu is " + age + " years old \n"+now+"\n"+check);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(doubleone));
        System.out.println(result);
        System.out.println(day);
        
        input.close(); // Close the Scanner
    }
}