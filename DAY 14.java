import java.util.*;
/*Minimum number of deletions to make a string palindrome
Given a string of size ‘n’. The task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome. 

Note: The order of characters should be maintained. 

Examples : 

Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
Resultant string will be 'abcba'
which is a palindromic string


Bharath
Output 2
Explanation remove B and t
harah
*/
class Main{
    static int minDeletionToMakePalindrom(String s){
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int l=2;l<=n;l++){
            for(int i=0;i<n-l+1;i++){
                int j=i+l-1;
                
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i+1][j],dp[i][j-1]);
                }
                System.out.println(s.substring(i,j+1));
            }
        }
        return dp[0][n-1];
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=input.nextLine();
        System.out.println("Minimum Deletion : "+minDeletionToMakePalindrom(s));
    }
}
