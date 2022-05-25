Problem
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 

Note
String S consists of lowercase English Alphabets only.

Sample Input
aba
Sample Output
YES
Time Limit: 1
Memory Limit: 256
Source Limit:

CODE:

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int j=name.length()-1;
        int c=1,i=0;
        while(i<j){
            
            if(name.charAt(i)!=name.charAt(j)){
                     c=0;  
            }
            i++;j--;
        }
        if(c==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    
    }
}
