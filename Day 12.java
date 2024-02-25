/* AIM : DAY 12
       Find Excel column name from a given column number
       MS Excel columns have a pattern like A, B, C, …, Z, AA, AB, AC, …., AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named “A”, column 2 as “B”, and column 27 as “AA”.
       Given a column number, find its corresponding Excel column name. The following are more examples.

       Input          Output
        26             Z
        51             AY
        52             AZ
        80             CB
        676            YZ
        702            ZZ
        705            AAC
        
        Date : 25/02/24
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Column Number : ");
		int c=input.nextInt();
		String ex="";
		while(c>0){
		    int rem=c%26;
		    
		    if(rem==0){
		        ex+='Z';
		        c=(c/26)-1;
		    }
		    else{
		        ex+=(char)((rem-1)+'A');
		        c=c/26;
		    }
		}
		System.out.print("Corresponding Excel Name is : ");
		for(int i=ex.length()-1;i>=0;i--){
		    System.out.print(ex.charAt(i));
		}
	}
}
