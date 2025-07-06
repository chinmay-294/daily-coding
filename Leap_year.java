package Fuel.com;
import java.time.Year;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 == 0)||(year % 400 == 0)){
			System.out.println("IT IS A LEAP YEAR");
		}
		else {
			System.out.println("IT IS NOT A LEAP YEAR");
		}
	}

}
