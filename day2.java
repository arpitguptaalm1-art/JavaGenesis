package javagenesis;

public class day2 {
    public static void main(String[]area) // we are free to give any name to string but generally it is recommended to use args as 'args'=> arguments.
    { // Hardcode Values: values of any variables are defined inside the code not by the users. 
        float len=32.43f;
        float bre=12.452f;
        float radius=8.53f;
        float base=78.13f;
        float height=97.12f;
        
        // Area of rectangle=length*breadth
        System.out.println("Area of the reactagle: "+len*bre);

        // Area of triangle=(base*height)1/2
        System.out.println("Area of the triangle: "+(base*height)/2);

        //Area of circle=pi*radius^2
        System.out.println("Area of circle: "+(Math.PI)*(Math.pow(radius,2)));
        // Math.PI= used to add the value of pi(ie.3.14) using java methods
        // Math.pow()=  used to solve exponents in the calculation 

        byte a=-128; // byte: its size is 8-bits
        short b=234; // short: its size is 16-bits
        int c=234243; // int:  its size is 32-bits
        long d=42948208038432l; // long: its size is 64-bit and we use l to differ between int and long
        int e=0b1010101010; // binary: we use 0b to write any no. in binary
        float f=1.2e23f; // float: size 32-bits and we use f to differ between float and double and float stores no. till .7 precision 
        double g=12132.2313323124; // double: size 64-bits and it stores the no. till .14 precision
        char h='a'; // char: size 2-bits
        char i='\u0042'; //unicode for 'B'
        boolean j=true; // boolean: 0 and 1 
        String k="Arpit Gupta"; 
        System.out.println(--a); // loop starts and goes to end or starting 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(e);
    }
    
}
