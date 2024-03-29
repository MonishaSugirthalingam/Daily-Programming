/*
Consecutive Four Sum Number
A positive integer is called as a `Consecutive Four Sum (CFS) number' if that number can be expressed as the sum of four consecutive positive integers.  10 is a CFS number since 10= 1+2+3+4; 50 is a CFS number since 50= 11+12+13+14.  7 is not a CFS number since  7 cannot be expressed as a sum of four consecutive number.  Similarly, 20 is not a CFS number.  Given a number `n', write an algorithm and the subsequent python code to check whether the given number is a CFS number or not. If so, your code should  print 1 ( here, 1 is an indicator which conveys that the given number is a CFS number)  and also print the starting integer among the four consecutive integers.  If the given number is not a CFS number, your code should output 0.  For eg, if 10 is the input, your code should output : 1 and 1.  Here 1 is the starting integer of the four consecutive integers for 10. If 7 is the input, your code should output : 0.  Given the integer 20, your code should output only 0.

Input format:

Enter the positive integer

Output format :

0 or 1   (If the given number is a CFS , output should be 1;  If the given number is not a CFS, it should be 0.)

Starting integer of the four consecutive integers. ( The second output, is applicable only when the first output is 1)

Sample Input :

10

Sample Output 

1

1

DATE : =3/03/24

*/


import java.util.*;
public class Main
{
    static int findCFS(int n){
        for(int i=1;i<=n;i++){
		    int sum=0;
		    for(int j=i;j<i+4;j++){
		        sum=sum+j;
		    }
		    if(sum==n){
		        return i;
		    }
		}
		return 0;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Integer : ");
		int n=input.nextInt();
		int r=findCFS(n);
		if(r!=0){
		    System.out.println(1);
		    System.out.println(r);
		}
		else{
		    System.out.println(r);
		}
	}
}
