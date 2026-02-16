// Duplicate Detection in Arrays

package javagenesis;
import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=s.nextInt();
        boolean flag=false;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
