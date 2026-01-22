// learn while and for loop

package javagenesis;
import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num1=scan.nextInt();
        // using for loop to find the sum of digits of the given no.
        int sum=0;
        int ld;
        for (int i=0;i<=num1;i++) // for (initialization,comparision,updation) {}
        {
            ld=num1%10;
            sum=sum+ld;
            num1=num1/10;
        }
        System.out.println("The sum of digit for the given number is: "+sum);
        // using while loop to find the multiplication of digits of the given no.
        int mul=1;
        int num2=scan.nextInt();
        while(num2!=0) // while (comparision) {}
        {
            ld=num2%10;
            mul=mul*ld;
            num2=num2/10;
        }
        System.out.println("The multiplication of digits for the given number is: "+mul);
    }
}
