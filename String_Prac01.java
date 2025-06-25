package chinmay.com;
import java.util.Scanner;
public class String_Prac01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String name = "HARRY"; // Assign the String
        int a = name.length(); //Conveted to int for getting the length
        System.out.println(a);

        // p1
        name = name.toLowerCase();
        System.out.println(name);

        //p2
        String text = "To Lower Case";
        text = text.replace(' ','_');
        System.out.println(text);

        //p3
        String letter = "Dear |<name>|, Thanks alot !";
        letter = letter.replace("|<name>|", "Chinmay");
        System.out.println(letter);

        //p4
        String mystring = "To check  double or triple space we use indexOf to check it";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
        // it shows -1 if value not available

        //p5
        String myletter = "Dear Chinmay,\n\tThis Course is nice.\n\tThanks!";
        System.out.println(myletter);

    }
}
