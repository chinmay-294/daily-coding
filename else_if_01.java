package chinmay.com;
import java.util.Scanner;
public class else_if_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Current Age :- ");
        int age= sc.nextInt();
        if(age>56){
            System.out.println("You Are Happy");
        }
        else if(age>46){
            System.out.println("You are good");
        }
        else if(age>36){
            System.out.println("Are you ok");
        }
        else{
            System.out.println("You are going to be entered");
        }


    }
}
