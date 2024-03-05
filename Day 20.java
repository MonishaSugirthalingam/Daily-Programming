import java.util.*;
/* AIM :Decode String 
You have been given an encoded string. Your task is to decode it back to the original string.

- An encoded string will be of the form <count>[encoded_string], where the 'encoded_string' inside the square brackets is being repeated exactly 'count' times. Note that 'count' is guaranteed to be a positive integer and can be greater than 9.
- There are no extra white spaces and square brackets are well-formed.
For example -
Input: 2[a]
“a” is encoded 2 times, hence the decoded string will be "aa".

Input: 3[a2[b]]
“b” is encoded 2 times, which decodes as 3[abb]. Now, "abb" is encoded 3 times, hence decoded string will be "abbabbabb". 

Constraints:
 1 <= T <= 20
 1 <= |S| <= 500

 where |S| is the length of the Decoded string.

 Time limit: 0.400 sec
Sample Input 1:
2
3[a]2[bc]
a1[b]1[cc]
Sample Output 1:
aaabcbc
abcc
Explanation for sample 1:
For the first test case, "a" is encoded 3 times and "bc" is encoded 2 times. After combining these two strings after decoding, we'll get "aaa" + "bcbc" = "aaabcbc".
Sample Input 2:
1
ab2[c3[b]]
Sample Output 2:
abcbbbcbbb

DATE : 05/03/24

*/
class Main{
    static void fun(Stack<String> s,Stack<Integer> n){
        String temp="";
        String t="";
        while(!s.empty() && t!="["){
            temp=temp+t;
            t=s.pop();
        }
        t="";
        int p=n.pop();
        t=temp;
        while(p>1){
            temp=temp+t;
            p--;
        }
        s.push(temp);
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       System.out.print("String : ");
       String str=input.nextLine();
       //String str="ab2[c3[b]]";
        Stack<String> s=new Stack<>();
        Stack<Integer> num=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='['){
                s.push("[");
            }
            else if(str.charAt(i)>48 && str.charAt(i)<=57){
                
                num.push((int)str.charAt(i)-48);
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                String t=""+str.charAt(i);
                s.push(t);
            }
            else{
                fun(s,num);
            }
        }
        String r="";
        while(!s.empty()){
            r=r+s.pop();
        }
        for(int i=r.length()-1;i>=0;i--){
            System.out.print(r.charAt(i));
        }
    }
}
