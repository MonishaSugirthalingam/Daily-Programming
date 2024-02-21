import java.util.*;
/*

AIM :learn and Implementation of scop of variables in java language
DATE : 01/02/2024

Concept : 1.Class level Scope (Member Variable) ==> These variables must be declared inside class (outside any function). 
                                                    They can be directly accessed anywhere in class.
                                                    
                                                    Apart from this we have default,public,protected and private modifiers under member variable.This is for restrict the scope of variables program 
                                                    
                                                    Default ==> Inside the package only
                                                    Private ==> Inside the class only
                                                    Protected ==> accessible within the same package or subclasses in different packages.
                                                    public ==> Anywhere(All Packages,All classes and all subclasses)
                                                    
          2.Method Level Scope (local Variable) ==> Variables declared inside a method have method level scope and can’t be accessed outside the method. 
                                                    Local variables don’t exist after method’s execution is over. 
          
          3.Block Level Scope (Looping Variable) ==>A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
*/
class Modifier{
    private String greeting="Welcome to Grade Calculator";// accessiable inside the class
    
    public void display1(){ //it can be accessiable anywhere
        System.out.print("Thank You!!!!");
    }
    
    protected void display2(){
        
        System.out.println(greeting);
        System.out.println("Now,I am Your FAN!!!!");
    }
}
class modisub extends Modifier {
    
    void dis(){
        display2();//private function can be accessed inside the subclass
    }
}
public class Main{
    
    char grade;//class scope(Member variable).Can be accessed anywhere inside the class and this is default variable
    static float avg;
    
    void membervar(){ //here i cant use static keyword for method declaration,becoz non static variable cant be accessed inside the static function
        System.out.println("Your score is : "+avg);
         if(avg>=90){
            grade='S';
        }
        else if(avg>=80 && avg<90){
            grade='A';
        }
        else if(avg>=70 && avg<80){
            grade='B';
        }
        else if(avg>=60 && avg<70){
            grade='C';
        }
        else if(avg>=50 && avg<60){
            grade='D';
        }
        else if(avg>=40 && avg<50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Your Grade is : "+grade); //grade is a member variable,we can access anywhere inside the class
    }
    static void loopingAndlocalvar(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any five subjects Marks out of 100 : ");
        float sums=0;//Method scope(local variable) cant be accessed outside of the method(loopingvar)
         for(int i=0;i<5;i++){ //i ==> block scope,cant be accessed outside this loop
             
            float m=input.nextFloat(); //Block scope,cant be accessed outside this loop
            if (m>100){
                System.out.println("Invalid Input!!!!..Please ReEnter the Mark(should be <=100) for Mark Entered as "+m);
                i--;
            }
            else{
                sums+=m;
            }
         }
        avg=sums/5;
    }
    public static void main(String args[]){
        modisub ob2=new modisub();
        ob2.display2();
        loopingAndlocalvar();
        Main ob=new Main();
        ob.membervar();
        Modifier ob1=new Modifier();
        ob1.display1();
    }
}
