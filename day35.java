// sand clock pattern

import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Print upper half of the sand clock
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j >= i && j < rows - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print lower half of the sand clock
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows; j++) {
                if (j >= i && j < rows - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
