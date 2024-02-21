/*
AIM  :  OCOP
Learn about functions
The program writes a function to generate an ATM

Inputs
Function Name String | OTP Generation | Cash Withdrawal | Cash Deposit | Captcha Generation 

Write a switch case to call a different method 

For OTP Generation your OTP should contain 6 digit number

For Captcha generation your captcha should contain 10 characters 

If you request to withdraw or deposit that time you have to receive the amount as a second input inside the specific function add 18 ℅ GST to it then print the amount either successfully withdrawn this much amount or X amount successfully deposited to your account 


Example:
Otp func should return 123456 
Captcha Generation gHt@63Dq1A

Cash Deposit
Input 1000
Output 1180 amount deposited to your account successfully Cash Withdrawal 
Input 1000
Successfully withdraw 1180 from your account.


Used Build In Function ==>  For OTP Generation 
                            Random rand = new Random();
                            int randomNum = rand.nextInt(max – min + 1) + min;
*/
import java.util.*;
class OTP {
    //constructor
    String generateopt(){
        
        String otp="";
        for(int i=0;i<6;i++)
        {
            Random rand=new Random();
		    int r=rand.nextInt(9-0+1)+0;// you can directly keep 10 here  ⇒ okay na
		    otp+=r;   
        }
        return otp;
    }
    boolean checkotp(String otp){
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter OTP       :  ");
        String inotp=input.nextLine();
        if(inotp.length()!=otp.length()){
            return false;
        }
        else{
            for(int i=0;i<6;i++){
                if(inotp.charAt(i)!=otp.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
    OTP(){
        super();
        String otp=generateopt();
        System.out.print("\nGenerated OTP   :  "+otp);
        while(!checkotp(otp)){
            System.out.println("Invalid OTP!!!!!!\nDo it Again...");
            otp=generateopt();
            System.out.print("\nGenerated OTP   :  "+otp);
        }
    }
    
    
}
class Captcha{
    String generatecaptcha()
    {
        Random rand=new Random();
        String temp="";
        int r;
// use loop to calculate the captcha whenever the length of the string is fixed
Replay ⇒ but how can we maintain a format na..how is that possible inside a loop..
        r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'a');
		r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'A');
		r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'a');
		temp+='@';    
		r=rand.nextInt(9-0+1)+0;
		temp+=r;
		r=rand.nextInt(9-0+1)+0;
		temp+=r;
		r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'A');
		r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'a');
		r=rand.nextInt(9-0+1)+0;
		temp+=r;
		r=rand.nextInt(25-0+1)+0;
		temp+=(char)(r+'A');
		
		return temp;
    }
    boolean checkcap(String cap){
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter CAPTCHA       :  ");
        String incap=input.nextLine();
        if(incap.length()!=cap.length()){
            return false;
        }
        else{
            for(int i=0;i<10;i++){
                if(incap.charAt(i)!=cap.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
    Captcha(){
        super();
        System.out.print("\nGenerated CAPTCHA   :  ");
        String cap=generatecaptcha();
        System.out.print(cap);
        while(!checkcap(cap)){
            System.out.println("Invalid CAPTCHA!!!!!!\nDo it Again...");
            cap=generatecaptcha();
            System.out.print("\nGenerated CAPTCHA   :  "+cap);
        }
    }
}
public class Main
{
    static void deposit(){
        Scanner input=new Scanner(System.in);
        OTP ob1=new OTP();
        System.out.print("\nEnter Amount        :  ");
        double amt=input.nextDouble();
        amt=amt+(amt*0.18);
		Captcha ob2=new Captcha();
		System.out.println("\n"+amt+" amount deposited to your account successfully!!!");
    }
    static void withdraw(){
        Scanner input=new Scanner(System.in);
        OTP ob1=new OTP();
        System.out.print("\nEnter Amount        :  ");
        double amt=input.nextDouble();
        amt=amt+(amt*0.18);
		Captcha ob2=new Captcha();
		System.out.println("\n"+amt+" amount withdrawed to your account successfully!!!");
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to ATM!!!\n");
		System.out.print("For Deposit Enter 1\nFor Withdraw Enter 2\n\nEnter Your Choice    :  ");
		String choice=input.nextLine();
		System.out.println();
		switch (choice){
		    case "1":
		        deposit();
		        break;
		    case "2":
		        withdraw();
		        break;
		    default:
		        System.out.println("Invalid Input!!!!");
		}
	}
}


