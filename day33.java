// adding digits till we get a single digit

import java.util.Scanner;   
public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // user input

        while (num >= 10) {  // Continue until num is a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Add the last digit to sum
                num /= 10;        // Remove the last digit
            }
            num = sum;  // Update num to the sum of its digits
        }

        System.out.println("The final single digit is: " + num);
        sc.close();
    }
}
