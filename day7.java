// Arithmetic progression 

package javagenesis;
import java.util.Scanner;
public class day7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float a=scan.nextFloat();
        System.out.println("The first elment of the AP is: "+a);
        float d=scan.nextFloat();
        System.out.println("The difference between the elment of the AP is: "+d);
        float n=scan.nextFloat();
        System.out.println("The number of element of the AP is: "+n);
        
        System.out.println("The sum of elements of the AP is: "+(n*((2*a)+(n-1)*d)*0.5));
        scan.close();
    }
}
