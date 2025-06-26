package chinmay.com;

import java.util.Scanner;

public class Coditional_01 {
    public static void main(String[] args) {
//        int age = 19;
//        if(age>18){
//            System.out.println("Yes you can drive");
//        }
//        else {
//            System.out.println("Sorry you Can't");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :- ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("U can");
        }
        else{
            System.out.println("U Can't");
        }

    }
}
