import java.util.*;
/*AIM :
Given a string S consisting of N, lower case English alphabet, it is also given that a string is encrypted by first replacing every substring of the string consisting of the same character with the concatenation of that character and the hexadecimal representation of the size of the substring and then revering the whole string, the task is to find the encrypted string. 

Note: All Hexadecimal letters should be converted to Lowercase letters.

Examples:

Input: S = “aaaaaaaaaaa”
Output: ba  
Explanation:

First convert the given string to “a11” i.e. write, character along with its frequency.
Then, change “a11” to “ab” because 11 is b in hexadecimal.
Then, finally reverse the string i.e “ba”.
Input: S = “abc”
Output: 1c1b1a

Date : 25/02/24

*/
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input : ");
		String str=(input.nextLine()).toLowerCase();
		String s="";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)!=' '){
		        s+=str.charAt(i);
		    }
		}
		//System.out.println(s);
		String temp="";
		HashMap<Character,Integer> freq=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    if(!freq.containsKey(s.charAt(i))){
		        freq.put(s.charAt(i),1);
		        temp+=s.charAt(i);
		    }
		    else{
		        freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
		        
		    }
		}
		//System.out.println(freq+" "+temp);
		String hexarr[]=new String[temp.length()];
		for(int i=0;i<temp.length();i++){
		    hexarr[i]=Integer.toHexString(freq.get(temp.charAt(i)));
		    //System.out.println(temp.charAt(i)+" "+hexarr[i]);
		}
		System.out.print("Output : ");
		for(int i=temp.length()-1;i>=0;i--){
		    System.out.print(hexarr[i]+temp.charAt(i));
		}
	}
}
