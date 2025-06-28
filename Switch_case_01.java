package chinmay.com;
import java.util.Scanner;
public class Switch_case_01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :-");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are a teeneager");
                break;
            case 23:
                System.out.println("You will get a job");
                break;
            case 28:
                System.out.println("You will get married");
                break;
            default:
                System.out.println("You are happy");
        }
        System.out.println("Thanks For Using My Code");
//
//            String var = "harry";
//        switch (var){
//            case "Shubham":
//                System.out.println("You are a teeneager");
//                break;
//            case "Chinmay":
//                System.out.println("You will get a job");
//                break;
//            case "Namish":
//                System.out.println("You will get married");
//                break;
//            default:
//                System.out.println("You are happy");
//        }
//        System.out.println("Thanks For Using My Code");


    }
}
