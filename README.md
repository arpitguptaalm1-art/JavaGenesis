# JavaGenesis
# 30 Days of Java learning series:

Welcome to my 30 Days of Java Learning Challenge!
This repository documents my daily progress, code snippets, exercises, and notes as I learn Java step by step.

**The goal:** Build a strong foundation in Java programming and share my journey with the community.

### Day 1: ✅
Today I have installed the `JDK` and setup the path in the Environment variables and setup my vs code for java compilation and code running. and my second learning is the code very basic codes and conversion of `.java` file to `.class` file (bytecode) which is used by the JVM to highly and securely compile the java file. <br>
The basic and my first program is about printing my name and understanding the meaning of words used in it. <br>

**1. public:** This means the file is accessible for every one. <br>
**2. static:** This means not to create a new object of the code we are writing. <br>
**3. void:** The return type of the function is void (or empty). <br>
**4. main:** Form here our code starts to run. <br>

After writing this we define a string in main funtionc like `(String[]arg)`. <br>

And by using the syntax `System.out.println()` we printed our desired output. 

### Day 2: ✅
Today I have learned about the variavbles, and different data types (like int,float,double,byte,char,string,etc,) and even learn how to decleatr them. I have also learn how to use octal,binary and hexadecimal no. in int data type. What are the ranges of the data types. What is hardcoded values. Created and find the area of various objects through hardcoded values in java

**Hardcoded values:** Values of variables which are defined inside the code and not been change by the user directly without entering into the actual code.

### Day 3: ✅
Today I have learned hoe to take input for the user usnig Scanner class in java. For doing this we need to import `java.util.Scanner` class because it contains all the type of scanner objects we use. Then create a new scanner object sc (or and other name) and type `System.in` meaning we are taking input thourgh the keyboard. Ther define that which type of input you are going to take like integer(nextInt()), double (nextDouble()), String(nextLine()),etc.

### Day 4: ✅
Today I have write the program to find that the input number is even or odd and prime or composite. 

**Process flow:** <br>
**Step I:** First define Scanner obeject to take input form the user. <br>
**Step II:** If the input number is even then it must be divisible by 2 (or num%2==0). <br>
**Step III:** Using conditional statement else if ladder to verifiy the input is even,odd or the negative number according to the condtion. <br>
**Step IV:** If the input number is prime the it must be divisible by 1 and the input itself only (or num%1==0 && num%num==0 only). <br>
**Step V:** For this we need to imply the loop as well as if else condition; loop for continuous checking till input that it is divisible or not and if else for checking that it is divisible only twice or not and the input is negative or not. <br>

**Basic for and if else syntax:** <br> <br>
--> for (initializaion,comparision,updation) <br>

--> if (conditon)<br>
{<br>
}<br>
else <br>
{<br>
}<br>

### Day 5: ✅
Today I have learnt about loops and how to apply them in solving problems. Loops allow repetition of tasks without writing redundant code, making programs efficient and scalable.

- The for loop is useful when the number of iterations is known.
- The while loop is effective when iterations depend on a condition.
- Loops simplify logic and are essential for automation.

Loops are a fundamental building block in programming. They make repetitive tasks manageable and prepare the ground for more advanced concepts like **arrays, recursion, and pattern generation.**

### Day 6: ✅
Today I have make a program that convter the user input (in second) into the format of `hours:minutes:seconds`.
I use divide operator "/" and modulo operator for the conversion.

### Day 7: ✅
Today I have make a program that can find the sum of n numbers in the Arithmetic Progression.
An Arithmetic Progression (AP) is a sequence of numbers with a constant difference between consecutive terms.

The formula for the sum of the first n terms is:

**Sn=n/2{2a+(n-1)d}**

 where:

n = number of terms

a = first term

d = common difference

### Day 8: ✅

Today I have made a program to reverse the user input number. So the main logic for reversing the number is that:
1. Creating the variable name rev.
2. Finding the last digit of the number.
3. Adding the last digit to rev.
4. Dividing the last number by 10.
5. Multiplying the rev by 10.
6. Repeating the same process unless number is 0.

### Day 9: ✅

Today I have learned about the nested loops and by using it I have learned the basis of pattern printing and today I have printed 1 pattern the basic one and for this i have used two loops and my program 
can make as many as rows and columns as the user input for the pattern printing.

### Day 10: ✅

Today I have explored more and learned more about loops and nested loops, and learn more pattern printing. Today I have learned about the charachter printing in the nested loops and the right angled triangle in the loop.

### Day 11: ✅

Today I have explored more and learned more about loops and nested loops, and learn more pattern printing. Today I have learned about printing downward triangle.

### Day 12: 

Today, I explored how to print pyramid and diamond patterns using nested loops in Java. These problems are classic exercises to strengthen logic building, loop control, and understanding of spacing in console output.
- Nested loops are powerful for controlling spaces and stars.
- Pyramid → single loop with spaces + stars.
- Diamond → combination of pyramid and inverted pyramid.
- These patterns sharpen logical thinking and help in mastering loop constructs.

### Day 13: ✅

I learned how to print a hollow diamond pattern using nested loops and conditional logic.

Key Points:
• 	Used nested loops to control rows and columns.
• 	Applied spaces before and between characters to create the hollow effect.
• 	The upper half of the diamond is an expanding pyramid, while the lower half is a shrinking inverted pyramid.
• 	Conditions ensured only the boundary of the diamond was printed, leaving the inside empty.

# Daily progress chart:

<p align="center">
<table style="align:center">
<tr>
<th> Day     </th>
<th> Code             </th>
<th> Status        </th>
<tr>
<td> Day 1  ✅</td>
<td> Print "my name"</td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 2  ✅</td>
<td> variable, data types, area </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 3 ✅</td>
<td>  Scanner function </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 4 ✅</td>
  <td> Eve/odd and Prime/Composite </td>
<td> Done ✅ </td>
</tr>
<tr>
<td> Day 5 ✅</td>
  <td> Loops (sum and multiplication of digits)</td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 6 ✅</td>
  <td> Second to Hours:munites:second</td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 7 ✅</td>
  <td> Sum of n terms of an AP </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 8 ✅</td>
  <td> Reversing the number </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 9 ✅</td>
  <td>  Pattern printing </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 10 ✅</td>
  <td> Character printing and trinagle printing </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 11 ✅</td>
  <td> downward triangle </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 12 ✅</td>
  <td> Diamond and pyramid </td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 13 ✅</td>
<td> Hollow Diamond Printing</td>
<td> Done ✅</td>
</tr>
<tr>
<td> Day 14 </td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 15 </td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 16 </td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 17</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 18</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 19</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 20</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 21</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 22</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 23</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 24 </td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 25</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 26 </td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 27</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 28</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 29</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
<tr>
<td> Day 30</td>
  <td>  </td>
<td> Pending ⌛</td>
</tr>
</table>
</p>

Connect me on linkedin: [LINKEDIN](www.linkedin.com/in/arpit-gupta-702080380)
