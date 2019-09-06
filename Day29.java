/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Comparison between diagonals (100 Marks)
For this challenge, you need to take a matrix as an input from the stdin , calculate the sum of the digits for each diagonal and compare them.For example, 
in the below matrix 
1 2 3 
4 5 6 
7 8 9 
Diagonal 1 is 1,5,9. 
Diagonal 2 is 3,5,7. 

Input Format
A matrix is to be taken as input from stdin.On first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space. 

Constraints
1 < (n,m) < 100

Output Format
If sum of digits for diagonal 1 is found to be greater than diagonal 2, then print 'Diagonal 1' to the stdout. If sum of digits for diagonal 2 is found to be greater than diagonal 1, then print 'Diagonal 2' to the stdout. If both of the diagonal found to be equal, then print 'Equal' to the stdout. 

Sample TestCase 1

Input
3 3
2 3 4
1 4 6
3 8 9

Output
Equal   */


import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here

        Scanner sc = new Scanner(System.in);
        int n,j,i;

        n = sc.nextInt();
        j = sc.nextInt();

        int arr[][]; 

        arr = new int [n][j];
  

        int d1 = 0, d2 = 0; 

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
  
        for (i = 0; i < n; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
            // finding sum of primary diagonal 
                if (i == j) 
                d1 += arr[i][j]; 
  
            // finding sum of secondary diagonal 
                if (i == n - j - 1) 
                d2 += arr[i][j]; 
            } 
        } 
  
    // Absolute difference of the sums 
    // across the diagonals 
    if(d1>d2)
    System.out.print(d1-d2);
    else if(d1<d2)
    System.out.print(d2-d1);
    else
    System.out.print("Equal");
    
   }
}
