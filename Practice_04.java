package chinmay.com;
import java.util.Scanner;
public class Practice_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR WEBSITE!!!");
        String website = sc.next();

        if(website.endsWith(".com")) {
            System.out.println("IT IS A COMMERCIAL WEBSITE");
        }
        else if(website.endsWith(".org")) {
            System.out.println("IT IS A ORGANIZATION");
        }
        else if(website.endsWith(".in")) {
            System.out.println("IT IS A INDIAN WEBSITE");
        }

        }
    }

