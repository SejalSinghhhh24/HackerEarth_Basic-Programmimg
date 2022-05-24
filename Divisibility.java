Problem
You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by .

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer  denoting the size of array 
Second line:  space-separated integers.
Output format

If the number is divisible by , then print . Otherwise, print .

Constraints

Sample Input
5
85 25 65 21 84
Sample Output
No
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
Last digit of 85 is 5.
Last digit of 25 is 5
Last digit of 65 is 5.
Last digit of 21 is 1.
Last digit of 84 is 4.
Therefore the number formed is 55514  which is not divisible by 10.
  
  CODE:

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        int temp,l,sum=0;
        String ans;
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        if(data[N-1] % 10 == 0)
        {
            ans="Yes";
        }
        else{
        ans="No";
        }
        System.out.println(ans);
      
    }
}
