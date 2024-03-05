
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
import java.util.*;

class Main{
    static int min(int[][] a,int i,int j){
          return Math.min(a[i-1][j-1],Math.min(a[i][j-1],a[i][j-1]));
    }
    static void display(int[][] a,int row,int col){
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        String s1="whgtdwhgtdg";
        String s2="aswcfg";
    
        int[][] a=new int[s2.length()+1][s1.length()+1];
        
        //initialization
        for(int i=0;i<s2.length()+1;i++){
            for(int j=0;j<s1.length()+1;j++){
                a[i][j]=0;
            }
        }
        //base condition
        for(int j=0;j<s1.length()+1;j++){
            a[0][j]=j;
        }
        for(int i=0;i<s2.length()+1;i++){
            a[i][0]=i;
        }
        display(a,s2.length()+1,s1.length()+1);
        System.out.println();
        for(int i=1;i<s2.length()+1;i++){
            for(int j=1;j<s1.length()+1;j++){
                
                if(s1.charAt(j-1)==s2.charAt(i-1)){
                     a[i][j]=a[i-1][j-1];
                }
                else{
                    a[i][j]=1+min(a,i,j);
                }
            }
        }
        display(a,s2.length()+1,s1.length()+1);
        System.out.println(a[s2.length()][s1.length()]);
    }
}
