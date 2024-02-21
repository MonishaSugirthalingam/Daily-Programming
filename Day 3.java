import java.util.*;
/* 
 AIM : Day3 Take any number as input from the user, print a mathematical table for that number Using loops for and while 
       One concept is to learn about jump statements and also check is there any goto statements present in java if not please tell the reason why it is not present.
       Input: 100
       Example : 1 x 100 = 100
GOTO statement : is not in java.
                 Becoz it makes a program logic very complex 
                 tracing a flow of code is difficult
                 goto can be avoided by using Label, Break and Continue statement 
                    By using this keyword we can easily handle nested loop
DATE : 02/02/2024
*/

class Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //Mathematical table by for loop
        System.out.println("Mathematical table by for loop");
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }
        //Mathematical table by while loop 
        System.out.println("Mathematical table by while loop");
        int count=1;
        while(count<=10){
            System.out.println(count+" * "+n+" = "+(count*n));
            count++;
        }
        //Mathematical table by while loop  and label
        System.out.println("Mathematical table by while loop  and label");
        count=1;
        stop :
            while(true){
            System.out.println(count+" * "+n+" = "+(count*n));
            if(count==10){
                break stop;
            }
            count++;
        }
        
    }
}
