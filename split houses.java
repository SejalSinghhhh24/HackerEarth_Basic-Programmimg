Problem
You live in a village. The village can be represented as a line that contains  grids. Each grid can be denoted as a house that is marked as  or a blank space that is marked as .

A person lives in each house. A person can move to a grid if it is adjacent to that person. Therefore, the grid must be present on the left and right side of that person.

Now, you are required to put some fences that can be marked as  on some blank spaces so that the village can be divided into several pieces. A person cannot walk past a fence but can walk through a house. 

You are required to divide the house based on the following rules:

A person cannot reach a house that does not belong to that specific person.
The number of grids each person can reach is the same and it includes the grid in which the house is situated.
In order to show that you are enthusiastic and if there are many answers, then you are required to print the one where most fences are placed.
Your task is to decide whether there is a possible solution. Print the possible solution.

Input format

First line: An integer  that represents the number of grids ()
Second line:  characters that indicate the villages that are represented as  or  
Output format

The output must be printed in the following format:

First line: If possible, then print . Otherwise, print .
Second line: If the answer is , then print the way to do so.
Sample Input
5
H...H
Sample Output
YES
HBBBH
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
Each person can reach 1 grid. Each person can reach his own houses only.

Note that HB.BH also works. Each person can reach only 1 grid.

But H..BH does not work. Because the first person can reach 3 grids but the second one can only reach 1.

H...H does not work either. The first person can reach the second person's house which is bad.

So you need to print HBBBH because it has the most fences.
  
CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String name = s.next();  
        
        if(name.contains("HH")){
             System.out.println("NO");
        }
        else{
            String mai=name.replace(".","B");
            System.out.println("YES");
            System.out.println(mai);
           
        }
        

    }
}
