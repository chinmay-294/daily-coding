package Fuel.com;

import java.util.Scanner;
import java.util.Arrays;

public class Sort_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert back to sorted string
        String sortedString = new String(charArray);

        // Print the sorted string
        System.out.println("Sorted string: " + sortedString);
    }
}
