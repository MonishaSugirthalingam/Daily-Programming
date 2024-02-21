/*

AIM :
    one concept one program
    The concept is to learn what are variables available in your selected programming languages and how to use it and when to use it
    Example : Static, global, final, local
    Program : 
        Print a grade sheet using conditional statements 
        Like greater 90 S and followed by till F grade
        
Date : 31/01/24
language : Java 
           There are three types of variables in java 
              1. Local 2. Instance and  3.Static

*/


import java.util.*;
class Main
{  
    static char g1='S',g2='A',g3='B',g4='C',g5='D',g6='E',g7='F'; //static variable declaration and initialization
    String cmd;//Instance variable declaration
    static void instance(float avg){
         Main ob=new Main(); //i am creating a object inorder to access the instance variable
         //we cant access the instance without object
         if(avg>=90){
            String cmd=ob.cmd="EXCELLENT";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else if(avg>=80 && avg<90){
            String cmd=ob.cmd="VERY GOOD";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else if(avg>=70 && avg<80){
            String cmd=ob.cmd="GOOD";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else if(avg>=60 && avg<70){
            String cmd=ob.cmd="NOT BAD";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else if(avg>=50 && avg<60){
            String cmd=ob.cmd="OKAY";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else if(avg>=40 && avg<50){
            String cmd=ob.cmd="BAD";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        else{
            String cmd=ob.cmd="VERY BAD";
            System.out.println("For you,my cmd is "+cmd+" !!!");
        }
        
    }
    static void statics(float avg){
        
       
        if(avg>=90){
            System.out.println("Your Grade is : "+g1);
        }
        else if(avg>=80 && avg<90){
            System.out.println("Your Grade is : "+g2);
        }
        else if(avg>=70 && avg<80){
            System.out.println("Your Grade is : "+g3);
        }
        else if(avg>=60 && avg<70){
            System.out.println("Your Grade is : "+g4);
        }
        else if(avg>=50 && avg<60){
            System.out.println("Your Grade is : "+g5);
        }
        else if(avg>=40 && avg<50){
            System.out.println("Your Grade is : "+g6);
        }
        else{
            System.out.println("Your Grade is : "+g7);
        }
    }
    static float local(){
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any five subjects Marks out of 100 : ");
        float a=input.nextFloat(); //local variable declaration and initialization
        float b=input.nextFloat();
        float c=input.nextFloat();
        float d=input.nextFloat();
        float e=input.nextFloat();
        
        float sum=a+b+c+d+e;
        float avg=sum/5;
        System.out.println("Your score is : "+avg);
        
        return avg;
    }
    public static void main(String args[]){
        
        
        float a=local();//this is declared inside the method.Cannot be accessed outside the method
        statics(a);//this is declared inside the class,It can be accessed any methods inside the particular class
        instance(a);//this is declared inside the class but outside the body of the method.
        //Cant be accessed all the methods.
        //It can be access by their class object
    }
} 

