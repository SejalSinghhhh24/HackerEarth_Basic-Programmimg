Problem
You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

Input Format
The first and only line of input contains 3 space separated integers l, r and k.

Output Format
Print the required answer on a single line.

Constraints


Sample Input
1 10 1
Sample Output
10
Time Limit: 1
Memory Limit: 256

  
  
  
CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        int k=s.nextInt();
        int c=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                c++;
            }
        }
                      
        System.out.println(c);    


    }
}
