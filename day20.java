// adding two arrays of same size and storing the result in a third array

package javagenesis;
import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] result = new int[size];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("The result of adding the two arrays is:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
