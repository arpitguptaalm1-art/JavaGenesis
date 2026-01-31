// alphabet rinting

package javagenesis;
import java.util.*;
public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // size of the pattern (rows)

        // Print A
        System.out.println("Letter A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Conditions for A: top row, middle row, first column, last column
                if ((i == 0 && j > 0 && j < n) || 
                    (i == n/2 && j > 0 && j < n) || 
                    (j == 0 && i != 0) || 
                    (j == n && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print B
        System.out.println("\nLetter B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Conditions for B: first column, top row, middle row, bottom row, last column (except corners)
                if (j == 0 || 
                    (i == 0 && j < n) || 
                    (i == n/2 && j < n) || 
                    (i == n-1 && j < n) || 
                    (j == n && i != 0 && i != n/2 && i != n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print C
        System.out.println("\nLetter C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Conditions for C: top row, bottom row, first column
                if ((i == 0 && j > 0) || 
                    (i == n-1 && j > 0) || 
                    (j == 0 && i > 0 && i < n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}