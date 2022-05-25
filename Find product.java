Problem
You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo .

Input Format:
The first line contains a single integer N denoting the size of the array. The next line contains N space separated integers denoting the elements of the array

Output Format:
Print a single integer denoting the product of all the elements of the array Modulo .

Constraints:


Sample Input
5
1 2 3 4 5
Sample Output
120
Time Limit: 1
Memory Limit: 256
Source Limit:
CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        long n=s.nextLong(); 
        long ans=1;
        long mod=(long)Math.pow(10,9)+7;
        long[] a = new long[1000];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt(); 
             ans=(ans*a[i])%mod; 
         } 
        
                 
        System.out.println(ans);    // Writing output to STDOUT

       
    }
}

