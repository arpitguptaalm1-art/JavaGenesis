// conversion of seconds into hours:minutes:seconds

package javagenesis;
import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int sec=scan.nextInt();
        int hrs=00,min=00;
        if (sec>=0)
        {
            hrs=sec/3600;
                min=(sec%3600)/60;
                sec=(sec%60)%60;
        }
        System.out.printf("%d:%d:%d",hrs,min,sec);
        scan.close();
    }
    }