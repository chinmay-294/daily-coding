package chinmay.com;
import java.util.Scanner;
public class Practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Annual Income :--");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5){
            tax = tax + 0;
        }
        if(income>2.5f && income<=5f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if(income>5f && income<=10f){
            tax = tax + 0.05f*(5f - 2.5f);
            tax = tax + 0.2f*(income - 2.5f);
        }
        else if(income>10f){
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(10f - 5f);
            tax = tax + 0.3f*(income - 2.5f);
        }
        System.out.println("The Total Tax Paid By Employee is :--"+tax);
    }

}
