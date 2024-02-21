import java.util.*;
/*
AIM :
    Day 4:
    1. you know your weight but do your know you name weight 😆 let's calculate that
    a = 1, b = 2,....., z = 26
    name = "Bharath"; weight = 2+8+1+18+1+20+8 = 58
*/

class Main{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=(input.nextLine()).toUpperCase();
        int weight=0;
        for(int i=0;i<name.length();i++){
            weight+=((name.charAt(i)-'A'+1)%26);
        }
        System.out.println("Your Name Weight is : "+weight);
    }
}
