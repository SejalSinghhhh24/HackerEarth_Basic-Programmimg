Problem
You are given an array  of size  that contains integers. Here,  is an even number. You are required to perform the following operations:

Divide the array of numbers in two equal halves
Note: Here, two equal parts of a test case are created by dividing the array into two equal parts.
Take the first digit of the numbers that are available in the first half of the array (first 50% of the test case)
Take the last digit of the numbers that are available in the second half of the array (second 50% of the test case)
Generate a number by using the digits that have been selected in the above steps
Your task is to determine whether the newly-generated number is divisible by .

Input format

First line: A single integer  denoting the size of array 
Second line:  space-separated integers denoting the elements of array 
Output format
If the newly-generated number is divisible by , then print . Otherwise, print .

Constraints
 

Sample Input
6
15478 8452 8232 874 985 4512
Sample Output
OUI
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
The first digit of 15478 is 1.
The first digit of 8452 is 8.
The first digit of 8232 is 8.
The last digit of 874 is 4.
The last digit of 985 is 5.
The last digit of 4512 is 2.
The newly generated number will be 188452 which is divisible by 11. 

CODE:

import java.io.*;
import java.util.*;
public class TestClass {
    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       int N=s.nextInt();
       int sum1=0,sum2=0,m,n;
       int arr[]=new int[50];
       for(int i=0;i<N;i++){
           arr[i]=s.nextInt();
       }
       if(N%2==0){
           for(int i=0;i<N/2;i++){
             n=arr[i];
               while (n >= 10)
                     n /= 10;
                 sum1=sum1*10+n;   
     
           }
           for(int i=N/2;i<N;i++){
                m=arr[i];
                     m %= 10;
                 sum2=sum2*10+m;   
     
           }
       }
       int num=sum1*10+sum2;
       if(num%11==0){
           System.out.println("OUI");
       }
       else
       {
           System.out.println("NON");
       }
}
}
