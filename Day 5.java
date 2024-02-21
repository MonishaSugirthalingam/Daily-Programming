import java.util.*;
/* 

AIM :
     once you attain your individual char weight find which char is belongs to that weight and store if somewhere and remove that char from the container
     1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26
     a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z name = "Bharath"
     after 1st iteration
     a,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z name = "Bharath", letter = B, weight = 2, out_data = "B" 
     after 2nd iteration
     a,c,d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z name = "Bharath", letter = h, weight = 8, out_data = "Bi"
     after 3rd iteration
     c,d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z name = "Bharath", letter = a, weight = 1, out_data = "Bia"
     after 4th iteration
     c,d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,v,w,x,y,z name = "Bharath", letter = r, weight = 18, out_data = "Biau"
     after 5th iteration
     d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,v,w,x,y,z name = "Bharath", letter = a, weight = 1, out_data = "Biauc"
     after 6th iteration
     d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,v,w,x,z name = "Bharath", letter = t, weight = 20, out_data = "Biaucy"
     after 7th iteration
     d,e,f,g,h,j,k,m,n,o,p,q,r,s,t,v,w,x,z name = "Bharath", letter = h, weight = 8, out_data = "Biaucyl"
DATE : 04/02/2024

Build-in Function which i used here 
    Reducing a size of an array by dynamically newArray=Arrays.copyOf(oldArray,newsize)
*/

class Main{
    static char alpha[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static String nick="";
    static void remove(int pos){
        
        if(pos<alpha.length){
            nick=nick+alpha[pos];
            for(int i=pos;i<alpha.length-1;i++){
                alpha[i]=alpha[i+1];
            }
            alpha=Arrays.copyOf(alpha,alpha.length-1);
        }
        else{
            while(pos>=alpha.length){
                pos=pos-alpha.length;
            }
            nick=nick+alpha[pos];
            for(int i=pos;i<alpha.length-1;i++){
                alpha[i]=alpha[i+1];
            }
            alpha=Arrays.copyOf(alpha,alpha.length-1);
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=(input.nextLine()).toUpperCase();
        for(int i=0;i<name.length();i++){
            int val=(name.charAt(i)-'A')%26;
            remove(val);
            System.out.println("Iteration : "+(i+1));
            for(int j=0;j<alpha.length;j++){
                System.out.print(alpha[j]+",");
            }
            System.out.print(" "+name+", ");
            System.out.print("letter : "+name.charAt(i)+", ");
            System.out.print("Weight : "+(val+1)+", ");
            System.out.println("Out_Data : "+nick);
        }
        System.out.println("\nYeahh!!!! Your Nick Name is "+nick);
   }
}
