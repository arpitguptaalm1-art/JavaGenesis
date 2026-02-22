// printing ARPIT letteres using stars 

import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Print A
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || j == 0 || j == rows - 1 || i == rows / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   "); // Space between letters

            // Print R
            for (int j = 0; j < rows; j++) {
                if (i == 0 || j == 0 || j == rows - 1 || i == rows / 2 || (i < rows / 2 && j == rows - 1) || (i > rows / 2 && j == i - rows / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Print P
            for (int j = 0; j < rows; j++) {
                if (i == 0 || j == 0 || j == rows - 1 || i == rows / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Print I
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == rows - 1 || j == rows / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // Print T
            for (int j = 0; j < rows; j++) {
                if (i == 0 || j == rows / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close(); 
    }
}
