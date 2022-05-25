Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
 where S denotes the length of string S.

Sample Input
abcdE
Sample Output
ABCDe
Time Limit: 5
Memory Limit: 256
Source Limit:


CODE:
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char arr[]=new char[100];
        for(int i=0;i<name.length();i++){
            arr[i]=name.charAt(i);
        }  
        for(int i=0;i<arr.length;i++){
         
                 if (arr[i]>='A' && arr[i]<='Z')
                    arr[i] = (char) (arr[i] + 'a' - 'A');
                 else if (arr[i]>='a' && arr[i]<='z')
                 arr[i] = (char) (arr[i] + 'A' - 'a');
    }
        
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        } 
           
        
    }
}
