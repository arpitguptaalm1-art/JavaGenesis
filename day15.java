package javagenesis;
import java.util.*;
public class day15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int m = scanner.nextInt();
        
        // by using bitwise operators we swap two numbers
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println("After swapping: n = " + n + ", m = " + m);
        
        scanner.close();
    }
}
