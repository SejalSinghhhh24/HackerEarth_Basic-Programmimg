Problem
Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

Sample Input
12X345-67
Sample Output
invalid
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).
 
CODE:
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();    
       boolean c=true,m=false;
        
        if(n.length()==9){
        
        if(n.charAt(2)=='A'||n.charAt(2)=='E'||n.charAt(2)=='I'||n.charAt(2)=='O'||n.charAt(2)=='U'||n.charAt(2)=='Y'){
            c=false;
        }
                            if((n.charAt(0)+n.charAt(1))%2==0){
                                if((n.charAt(3)+n.charAt(4))%2==0){
                                   if((n.charAt(4)+n.charAt(5))%2==0){
                                        if((n.charAt(7)+n.charAt(8))%2==0){
                                            if(n.charAt(6)=='-'){
                        
                                                m=true;
                                           }
                                          
                                    }
                                    
                                }
                               
                            }
                            
                        }
            if(m&&c){
                System.out.println("valid");
            }            
            else{
                System.out.println("invalid");
            }
                    
                    
                    
    }
                   
                
                
   
    }
}
