/* Read input from STDIN. Print your output to STDOUT
How Much Big Is Your Number (100 Marks)
For this challenge, you will take an integer input from stdin, store it in a variable and  calculate the number of digits in the number using division operator. 

Input Format
A single integer value to be taken as input from stdin and stored it in a variable of your choice. 

Constraints
1 < = n < = 18

Output Format
Print the value which you will get after calculating the number of digits. 

Sample TestCase 1
Input
34567
Output
5*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner scan =  new Scanner(System.in);
   int a;
   int s=0;
   a = scan.nextInt();
   if(a>=1)
   {
      while(a!=0)
      {
         s++;
         a = a/10;
      }
      
   System.out.print(s);
   }
   else
   System.out.print("Wrong input");
   
   
   
   }
}
