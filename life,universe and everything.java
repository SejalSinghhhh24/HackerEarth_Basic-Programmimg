Problem
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Sample Input
1
2
88
42
99
Sample Output
1
2
88
Time Limit: 5
Memory Limit: 256
Source Limit:

CODE:
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        while(true){
        int a=s.nextInt();
        if(a==42){
            break;
        }
        System.out.println(a);
        }
        // Write your code here

    }
}
