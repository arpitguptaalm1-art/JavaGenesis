// pattern printing part 2

package javagenesis;
import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // printing numbers in a square
        System.out.print("enter the value of n: ");
        int n=scan.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // printing characters in a square
        System.out.print("enter the value of m: ");
        int m=scan.nextInt();
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=m;j++)
            {
                System.out.print((char)+(i+64));
            }
            System.out.println();
        }

        // printing star triangle
        System.out.print("enter tha value of o: ");
        int o=scan.nextInt();
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
