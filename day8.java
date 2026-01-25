// reversing the number

package javagenesis;
import java.util.Scanner;
public  class day8{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ld;
        int rev=0;
        while(n!=0)
        {
        
            ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.println(+rev);
    }
}