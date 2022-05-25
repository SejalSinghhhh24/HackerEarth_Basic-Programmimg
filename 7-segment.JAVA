Problem
You all must have seen a seven segment display.If not here it is:



Alice got a number written in seven segment format where each segment was creatted used a matchstick.

Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.

Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.

 

Input Format:

First line contains T (test cases).

Next T lines contain a Number N.

Output Format:

Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.

Constraints:



Sample Input
2
1
0
Sample Output
1
111
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
If you have 1 as your number that means you have 2 match sticks.You can generate 1 using this.

If you have 0 as your number that means you have 6 match sticks.You can generate 111 using this.

CODE:
import java.util.*;

public class hackerearth {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t, i, k;
        t = sc.nextInt();
        while (t-- != 0) 
        {
            int s = 0;
            String a = sc.next();
            for (i = 0; i < a.length(); i++) 
            {
                if (a.charAt(i) == '0')
                    s = s + 6;
                else if (a.charAt(i) == '1')
                    s = s + 2;
                else if (a.charAt(i) == '2')
                    s = s + 5;
                else if (a.charAt(i) == '3')
                    s = s + 5;
                else if (a.charAt(i) == '4')
                    s = s + 4;
                else if (a.charAt(i) == '5')
                    s = s + 5;
                else if (a.charAt(i) == '6')
                    s = s + 6;
                else if (a.charAt(i) == '7')
                    s = s + 3;
                else if (a.charAt(i) == '8')
                    s = s + 7;
                else if (a.charAt(i) == '9')
                    s = s + 6;
            }
            if (s % 2 != 0) 
            {
                int j = 1, l = 7;
                System.out.print(l);
                for (k = 2; k <= s / 2; k++)
                    System.out.print(j);
            } 
            else 
            {
                int j = 1;
                for (k = 1; k <= s / 2; k++)
                    System.out.print(j);
            }
            System.out.println();
        }
    }

}
