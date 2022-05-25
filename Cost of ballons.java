Problem
You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

Input format

First line:  that denotes the number of test cases ()
For each test case: 
First line: Cost of green and purple-colored balloons 
Second line:  that denotes the number of participants ()
Next  lines: Contain the status of users. For example, if the value of the  integer in the  row is , then it depicts that the  participant has not solved the  problem. Similarly, if the value of the  integer in the  row is , then it depicts that the  participant has solved the  problem.
Output format
For each test case, print the minimum cost that you have to pay to purchase balloons.

Sample Input
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0
Sample Output
69
14
Time Limit: 1
Memory Limit: 256
  
CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        
        while(N>0){
        int m=s.nextInt();
        int n=s.nextInt();
        int p=s.nextInt();
        int temp1=0,temp2=0;
        int[] arr= new int[100];
         int[] arr1= new int[100];
        for(int i=0;i<p;i++){
           
                arr[i]=s.nextInt();
                arr1[i]=s.nextInt();
            
        }
        for(int i=0;i<p;i++){
            temp1+= arr[i]*m+arr1[i]*n;
            temp2+= arr[i]*n+arr1[i]*m;
        }
        if(temp1<temp2){
           System.out.println(temp1); 
        }
        else{
            System.out.println(temp2);
        }
        N--;
        }

        
       

    }
}
