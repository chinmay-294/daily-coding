package chinmay.com;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("The Percentage Of Student is :");
        Scanner sc = new Scanner(System.in);

        System.out.println("Marks Obtain in English");
        int a = sc.nextInt();

        System.out.println("Marks Obtain in Science");
        int b = sc.nextInt();

        System.out.println("Marks Obtain in Marathi");
        int c = sc.nextInt();

        System.out.println("Marks Obtain in SST");
        int d= sc.nextInt();

        System.out.println("Marks Obtain in Maths");
        int e = sc.nextInt();

        int total = a+b+c+d+e;
        double avg = ((double) total/500)*100;
        System.out.println("Percentage Obtain is :"+avg +"%");
        sc.close();
    }
}
