package Fuel.com;
import java.util.Scanner;
public class Largest_Of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number (a)");
		int a = sc.nextInt();
		
		System.out.println("Enter number (b)");
		int b = sc.nextInt();
		
		System.out.println("Enter number (c)");
		int c = sc.nextInt();
		
		int largest;
		if(a>=b && a>=c){
			largest =a;
		}
		else if(b>=a && b>=c){
			largest = b;
		}else {
			largest =c;
		}
		System.out.println("The Largest Number is :-"+largest);
		
		

	}

}
