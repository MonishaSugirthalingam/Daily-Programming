import java.util.*;
/*AIM : Largest Factor Among Left Rotated Numbers
Given a four digit number ‘n’, find the largest factor among the left rotated numbers. Here left rotated numbers of a number ‘n’ is formed by rotating ‘n’ left 1 to 3 times. For example, if n is 2456, then when it is rotated once we get 4562, when it is rotated twice we get 5624 and when it is rotated thrice we get 6245. Factors of these numbers are

2456 - 1, 2, 4, 8, 307, 614, 1228

4562 - 1, 2, 2281

5624 - 1, 2, 4, 8, 19, 37, 38, 74, 76, 148, 152, 296, 703, 1406, 2812

6245 - 1, 5, 1249

The largest factor is 2812 and left rotated number with this factor is 5624.

Note: Read the input as integer and do entire processing as integer

Input Format

First line contains the number whose largest factor is to be found, n

Output Format

First line should contain the largest factor among the rotated numbers

Second line should contain the rotated number with the specified factor

DATE : 01/03/2456
*/
public class Main
{   
    static int factors(int n){
        int max=-999999;
        for(int i=1;i<=Math.sqrt(n);i++){
		  if(n%i==0){
		       if(n/i==i){
		          if(i>max && i!=n){
		              max=i;
		          }
		          System.out.print(" "+ i); 
		       }
		        else{
		           if(i>max && i!=n){
		               max=i;
		           }
		           if(n/i>max && n/i!=n){
		               max=n/i;
		           }
		           System.out.print(i+" " + n/i + " "); 
		        }
		    }
		}
		System.out.println("\n"+max);
		return max;
    }
    static int leftRotate(int n,int r){
        String num=String.valueOf(n);
        String temp1="";
        for(int i=0;i<r;i++){
            temp1+=num.charAt(i);
        }
        String temp2="";
        for(int i=r;i<num.length();i++){
            temp2+=num.charAt(i);
        }
        String temp=temp2+temp1;
        return Integer.parseInt(temp);
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=input.nextInt();
		int leftrotate=1;
		int max=factors(n);
		int maxfacnum=n;
		while(leftrotate<=3){
		    int m=leftRotate(n,leftrotate);
		    int Eachmaxfac=factors(m);
	        System.out.println(m+" "+Eachmaxfac);
	        if(Eachmaxfac>max){
	            max=Eachmaxfac;
	            maxfacnum=m;
	        }
		    leftrotate++;
		}
		System.out.println("\n\nLargest factor amoung the rotated numbers is "+max);
		System.out.println("Rotated numbers is "+maxfacnum);
	}
}
