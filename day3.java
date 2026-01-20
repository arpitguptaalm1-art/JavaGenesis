// code for entering name, course, age, gender, University roll no.

package javagenesis;
import java.util.Scanner; // it refers to the Scanner class file saved inside the java.util and by imoprting this we can easily use scanner objet for user input 
public class day3 {
    public static void main(String [] day3)
    {
        Scanner sc = new Scanner (System.in); // here we create a new scanner object named as sc (we cane name anything like n,scan,input,etc)
        String name=sc.nextLine(); // nextLine reads whole line until new line is entered 
        System.out.println("Name: "+name);
        String course=sc.nextLine();
        System.out.println("Course: "+course);
        int a=sc.nextInt(); // nextInt reads an integer 
        System.out.println("Age: "+a);
        sc.nextLine(); // we need to add an empty line because entering string after the integer is not done without this
        String gender=sc.nextLine();
        System.out.println("Gender: "+gender);
        long urn=sc.nextLong();
        System.out.println("University roll no.: "+urn);
        sc.close();
    }
}
