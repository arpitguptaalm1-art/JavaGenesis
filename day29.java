// robinson number printing in the array 

package javagenesis;
import java.util.*;
public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); 
         int arr[] = new int[n];
          for(int i=0;i<n;i++)
            {
                 arr[i] = sc.nextInt();
                 }
                  for(int i=0;i<n;i++){ 
                    int num = arr[i];
                    int sum = 0;
                    while(num>0){
                        int rem = num%10;
                        sum += rem*rem*rem;
                        num /= 10;
                    }
                    if(sum == arr[i]){
                        System.out.println(arr[i]);
                    }
                 } 
                 sc.close();
    }
}
