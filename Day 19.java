import java.util.*;
/* AIM : Problem statement
You are given two strings 'S' and 'T' of lengths 'N' and 'M' respectively. Find the "Edit Distance" between the strings.

Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. In order to do so, you can perform the following three operations:

1. Delete a character
2. Replace a character with another one
3. Insert a character
Note:
Strings don't contain spaces in between.

Constraints:
0 <= N <= 10 ^ 3
0 <= M <= 10 ^ 3

Time Limit : 1sec
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 Explanation For Sample Input 1 :
In 2 operations we can make the string T to look like string S. First, insert the character 'a' to string T, which makes it "adc".

And secondly, replace the character 'd' of the string T with 'b' from the string S. This would make string T to "abc" which is also the string S. Hence, the minimum distance.
Sample Input 2 :
whgtdwhgtdg
aswcfg
Sample Output 2 :
9

DATE : 04/03/24
*/
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("String1 : ");
		String s1=input.nextLine();
		System.out.print("String2 : ");
		String s2=input.nextLine();
		
		//String s1="sunday";
		//String s2="saturday";
		HashMap<Character,Integer> str1=new HashMap<>();
		HashMap<Character,Integer> str2=new HashMap<>();
		for(int i=0;i<s1.length();i++){
		    if(!str1.containsKey(s1.charAt(i))){
		        str1.put(s1.charAt(i),1);
		    }
		    else{
		        str1.put(s1.charAt(i),str1.get(s1.charAt(i))+1);
		    }
		}
		
		for(int i=0;i<s2.length();i++){
		    if(!str2.containsKey(s2.charAt(i))){
		        str2.put(s2.charAt(i),1);
		    }
		    else{
		        str2.put(s2.charAt(i),str2.get(s2.charAt(i))+1);
		    }
		}
		//System.out.println(str1+"\n"+str2);
		//int count1=0;
		
		//for detetion
		for(int i=0;i<s2.length();i++){
		    if(!str1.containsKey(s2.charAt(i))){
		        //count1++;
		        str2.remove(s2.charAt(i));
		    }
		}
		//System.out.println(count1+" "+str1+" "+str2);
		//for addition
		int count2=0;
		for(int i=0;i<s1.length();i++){
		    if(!str2.containsKey(s1.charAt(i))){
		        count2++;
		        str2.put(s1.charAt(i),1);
		    }
		    if(str2.containsKey(s1.charAt(i)) && str1.get(s1.charAt(i))>str2.get(s1.charAt(i)))
		    {
		        while(str1.get(s1.charAt(i))>str2.get(s1.charAt(i))){
		            str2.put(s1.charAt(i),str2.get(s1.charAt(i))+1);
		            count2++;
		        }
		    }
		    if(str2.containsKey(s1.charAt(i)) && str1.get(s1.charAt(i))<str2.get(s1.charAt(i)))
		    {
		        while(str1.get(s1.charAt(i))<str2.get(s1.charAt(i))){
		            str2.put(s1.charAt(i),str2.get(s1.charAt(i))-1);
		            count2++;
		        }
		    }
		}
		System.out.println("Minimum Number of Changes to Make String2 like String1 is : "+count2);
	}
}
