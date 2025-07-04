package Fuel.com;
import java.util.Scanner;
public class FUEL_BitwiseOperator{

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
//        int a = 7;  // Binary: 0111
//        int b = 5;  // Binary: 0101
    	
	
	    System.out.println("ENTER a");
	    int a = sc.nextInt();
	    
	    System.out.println("ENTER b");
	    int b = sc.nextInt();
	    
        System.out.println("AND (a & b): " + (a & b));   // 0111 & 0101 = 0101 (5)
        System.out.println("OR  (a | b): " + (a | b));   // 0111 | 0101 = 0111 (7)
        System.out.println("XOR (a ^ b): " + (a ^ b));   // 0111 ^ 0101 = 0010 (2)
        System.out.println("NOT (~a): " + (~a));         // ~0111 = 1000 (in 2's complement: -8)
        System.out.println("a << 1: " + (a << 1));        // 0111 << 1 = 1110 (14)
        System.out.println("a >> 1: " + (a >> 1));        // 0111 >> 1 = 0011 (3)
    }
}
