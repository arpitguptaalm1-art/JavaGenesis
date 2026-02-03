package javagenesis;
import java.util.*;
public class day17 {
    public static void main(String[] args) {
        // checking whether a number is even or odd using bitwise operator
        Scanner scanner = new Scanner(System.in);   
        int n = scanner.nextInt();
        if ((n & 1) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
