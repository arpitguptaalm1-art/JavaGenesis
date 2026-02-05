// finding the given no. is even,odd or prime no.

package javagenesis;

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean n=true;
        if (num<=1){
            System.out.print("neither even nor odd and ");
        }
        else if (num%2==0) // for even no. the no. is always the multiple of 2 so the remainder will be 0.
        {
            System.out.println("the number is even.");
        }
        else
        {
            System.out.println("the number is odd");
        }
        
        for (int i=2;i<num;i++)
        {
            if (num%i==0) // for prime no.the no. is only divisible by 1 and itself so if the no. is divisible by any other this will considered as composite no.
            {
                n=false;
            }
        }
        if (num<=1)
        {
            System.out.println("nither prime nor composite.");
        }
        else if (n)
        {
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is composite");
        }
    sc.close();

    }
}
