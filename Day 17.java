/*****************************************************************************
 *Aim : Maximum number of deletions to make a string palindrome
Given a string of size ‘n’. The task is to remove or delete the maximum number of characters from the string so that the resultant string is a palindrome. 
Palindrome length is 3
Note: The order of characters should be maintained. 
String should contain equal or more than two characters
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter a String : ");
	    String s=input.nextLine();
	    HashMap<Character,Integer> a=new HashMap<>();
	    int flag=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(!a.containsKey(s.charAt(i))){
	          a.put(s.charAt(i),i);
	      }
	      if(a.containsKey(s.charAt(i)) && i!=a.get(s.charAt(i))){
	          System.out.println("Maximum deletion of character to make string as palindrome : "+(s.length()-3));
	          flag=1;
	          break;
	      }
	    }
	    if(flag==0){
	        System.out.println("No palindrome");
	    }
	}
}
