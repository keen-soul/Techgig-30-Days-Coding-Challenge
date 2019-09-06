/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
Which row is bigger? (100 Marks)
For this challenge, you need to take a matrix as an input from the stdin, identify which row has the maximum sum of the digits.For example, in the below matrix 
1 2 3 
4 5 6 
7 8 9 
Row 1 is 1,2,3 
Row 2 is 4,5,6 
Row 3 is 7,8,9 

Input Format
The first line contains two integers N, M denoting the number of rows and columns respectively.
Each of the 'N' Next line contains M integers each.

Constraints
1 < (n,m) < 100

Output Format
If the sum of the digits of row 1 found to be greater than that of row 2 and row 3, then print 'Row 1' to the stdout. If the sum of all the rows found to be equal, then print 'Equal' to the stdout. 

Sample TestCase 1

Input
3 4
2 3 4 2
1 4 6 5
4 8 9 6

Output
Row 3  */

import java.io.*;
import java.util.*;
public class CandidateCode 
{
    private static String str;
    private static int t,len,k,i,max,m;
    private static char s,maxChar;

    private static int count (char s)
    {
      
        int n=0;
        for(i=0;i<len;i++)
        {
            if(str.charAt(i)==s)
            n++;
        }
        return n;
    }

    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        if(t>=1 && t<=10)
        {
            while(t!=0)
            {
                max=0;
                k=0;
                maxChar=0;
                str = sc.nextLine();
                len = str.length();

                while(k<len)
                {
                    s = str.charAt(k);
                    m = count(s);
                    if(max == m)
                    {
                        if(s<maxChar)
                        maxChar = s;                        
                    }
                    else if(m>max)
                    {
                        max = m;
                        maxChar = s;
                    }
                    k++;
                  
                }
                System.out.println(maxChar);
                t= t -1;;
            }

        }
        
   }
}

