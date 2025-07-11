package Fuel.com;

public class HollowTriangle {
    public static void main(String[] args) {
        int rows = 5; // You can change this for a larger triangle

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print pattern
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}