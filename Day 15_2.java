import java.util.*;
/*AIM : How to replace a substring of a string
Given three strings S, S1, and S2 consisting of N, M, and K characters respectively, the task is to modify the string S by replacing all the substrings S1 with the string S2 in the string S.

Examples:

Input: S = “abababa”, S1 = “aba”, S2 = “a”
Output: aba
Explanation:
Change the substrings S[0, 2] and S[4, 6](= S1) to the string S2(= “a”) modifies the string S to “aba”. Therefore, print “aba”.

DATE : 01/03/24
*/
class Main{
    static String call(String s,String s1,String s2,String t,String current){
         
         for(int i=0;i<s.length();i++){
            
            t+=s.charAt(i);
            if(t.equals(s1)){
                current=current+s2;
                t="";
                //System.out.println(current);
            }
            else if(t!="" && t.charAt(0)!=s1.charAt(0)){
                t="";
                current+=s.charAt(i);
            }
            else if(i==s.length()-1 && !t.equals(s1)){
                 current+=t;
            }
        }
        return current;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String : ");
       // String s="abababa";
        String s=input.nextLine();
        System.out.print("Enter the no.of subStrings : ");
        //int nsubstring=1;
        int nsubstring=input.nextInt();
        String l=input.nextLine();
        String t="";
        String current="";
        //String[] substrings={"aba","a","a"};
        String[] substrings=new String[nsubstring];
        for(int i=0;i<nsubstring;i++){
            substrings[i]=input.nextLine();
        }
        for(int i=0;i<nsubstring-1;i++){
            
            while(s.length()>=substrings[i].length()){
                s=call(s,substrings[i],substrings[i+1],t,current);
            }
        }
        System.out.println("Output : "+s);
        
    }
}
