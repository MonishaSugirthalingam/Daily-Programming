/**********************************************
 Aim ==> Day:8
     Print a mathematical table without using any loops( for, while, do while)
Date : 21/02/24
*******************************************************************************/
import java.util.*;
public class Main
{
    static int table(int m,int n){
        if(n==10){
            System.out.println(n+" × "+m+" = "+(n*m));
            return n;
        }
        else{
            System.out.println(n+" × "+m+" = "+(n*m));
            return(table(m,n+1));
            
        }
    }
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the Table : ");
	    table(input.nextInt(),1);
	    
	}
}
