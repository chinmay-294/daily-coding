package chinmay.com;
import java.util.Scanner;
public class Scanner_05 {
    public static void main(String[] args) {
        System.out.println("Sum Of Two Number :");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 ");
        int a = sc.nextInt();
       // float a = sc.nextFloat();
        System.out.println("Enter num2");
         int b = sc.nextInt();
       // float b = sc.nextFloat();
        int sum = a+b;
        System.out.println("The sum Of Two Number is :"+sum);

    }
}
