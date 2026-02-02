// checking power of 2 using bit manipulation

package javagenesis;
import java.util.*;
public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        
        // A number is a power of 2 if it has exactly one bit set in its binary representation.
        // This can be checked using the expression (n & (n - 1)) == 0, which is true only for powers of 2.
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        
        scanner.close();
    }
    
}
