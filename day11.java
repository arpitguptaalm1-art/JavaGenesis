// printing patterns part III

package javagenesis;
import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        // printing downward triangle
        
        System.out.println("enter the number: ");
        int a=s.nextInt();
        for (int i=a;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        s.close();
    }
    
}
