// pattern printing part IV

package javagenesis;
import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // printing downward right triangle
        int n=sc.nextInt();
        for (int i=n;i>0;i--)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int k=0;k<i;k++)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }

        // printing normal triangle
        int m=sc.nextInt();
        for (int i=0;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // printing daimond
        int a=sc.nextInt();
        for (int i=0;i<=a;i++)
        {
            for (int j=1;j<=a-i;j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=a-1;i>0;i--)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
