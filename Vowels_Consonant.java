package Fuel.com;

import java.util.Scanner;

public class Vowels_Consonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Get first character

        // Convert to lowercase for uniformity
        ch = Character.toLowerCase(ch);

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }
    }
}
