package chinmay.com;
import java.util.Scanner;
public class Practice_006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICES\n" +
                "ENTER 0 FOR STONE:\n" +
                "ENTER 1 FOR PAPER:\n" +
                "ENTER 2 FOR SCISSOR:\n");

        int useinput = sc.nextInt();
        int computerinput = (int)(Math.random() * 3); // Random 0–2

        System.out.println("YOUR CHOICE: " + choiceToWord(useinput));
        System.out.println("COMPUTER CHOICE: " + choiceToWord(computerinput));

        if(useinput == computerinput){
            System.out.println("IT IS A DRAW 🤝");
        }
        else if((useinput == 0 && computerinput == 2) ||
                (useinput == 1 && computerinput == 0) ||
                (useinput == 2 && computerinput == 1)) {
            System.out.println("🎉 YOU WIN!");
        } else {
            System.out.println("💔 YOU LOSE!");
        }

        sc.close();
    }

    public static String choiceToWord(int choice) {
        if (choice == 0) return "Stone";
        else if (choice == 1) return "Paper";
        else return "Scissor";
    }
}
