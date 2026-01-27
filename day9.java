// Pattern printing

package javagenesis;
import java.util.Scanner;
public class day9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number of rows and columns: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) // using for loop
        {
            for (int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("enter the number of rows and columns: ");
        int x=sc.nextInt();
        int i=0;
        while (i<x) // using while loop
        {
            int j=0; // in while loop we need to initialize the inner loop  values inside the main loop.
            while(j<x)
            {
                System.out.print("# ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
