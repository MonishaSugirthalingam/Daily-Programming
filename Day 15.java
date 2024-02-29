import java.util.*;
/* AIM :
Reverse Length Divisible (D)
Given a number N,  check if it is reverse length divisible. A number is said to be reverse length divisible if the first i digits of the number is divisible by (l-i-1) where l is the number of digits in N and 0 < i <= l. 

For example, 52267 is reverse length divisible because:

5 is divisible by 5

52 is divisible by 4

522 is divisible by 3

5226 is divisible by 2

52267 is divisible by 1.

43268 is not reverse length divisible. Print Yes if the number is reverse length divisible and no otherwise.

DATE : 29/02/24
*/
public class Main
{
    static boolean ReverseLengthDivisible(int n){
        int count=2;
        System.out.println("\n"+n+" is Divisible by "+1);
        while(n>10){
            n=n/10;
            if(n%count!=0){
                System.out.println(n+" is Not Divisible by "+count);
                return false;
            }
            else{
                System.out.println(n+" is Divisible by "+count);
                count++;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Integer : ");
		int n=input.nextInt();
		//int n=52267; // 5 52 522 5226 52267
		if(ReverseLengthDivisible(n)){
		    System.out.println("\nYES!!!...Hence Given Number is a Reverse Length Divisible");
		}
		else{
		    System.out.println("\nNo!!...Hence Given Number is Not a Reverse Length Divisible");
		}
	}
}
