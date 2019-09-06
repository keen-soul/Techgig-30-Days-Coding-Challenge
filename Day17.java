/* Read input from STDIN. Print your output to STDOUT
Find pairs(100 marks)
For this challenge, you need to take array and an integer as an input, check for pair in array with sum as that of an integer and if you find those two numbers in the array return true else return false. 

Input Format
You need to take an integer input on first line which tells about the size of the array.Another line will have array elements separated by spaces. Last line will have an integer input that defines the number for which the pair has to be searched in the array. 

Constraints
1 < n < 10^5
1 < A[i] < 10^5

Output Format
Print 'True' if the pair found in the array element else print 'False' to the stdout. 

Sample TestCase 1
Input
7
33 12 -76 11 9 7 6
20
Output
True*/

import java.io.*;
import java.util.*;
public class CandidateCode 
{
   public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 

    public static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
