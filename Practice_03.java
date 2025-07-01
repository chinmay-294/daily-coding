package chinmay.com;
import java.util.Scanner;
public class Practice_03 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter A Year");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("IT IS A LEAP YEAR");
        }
        else {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
