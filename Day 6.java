import java.util.*;
/*

AIM : 3. Let's play flames 😂😂😂 -> m-memorable person|motivator, e- entertainer, a-adviser
Input 
Bharath
Dhoni
Explain 
Barath
Doni
weight = 10
Output 
L

DATE : 05/02/24

*/
import java.util.*;
class Main{
    static char[] n1,n2;
    static void removeCommonLetters(){
        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    for(int x=i;x<n1.length-1;x++){
                        n1[x]=n1[x+1];
                    }
                    n1=Arrays.copyOf(n1,n1.length-1);
                    for(int x=j;x<n2.length-1;x++){
                        n2[x]=n2[x+1];
                    }
                    n2=Arrays.copyOf(n2,n2.length-1);
                }
            }
        }
        System.out.println("After removing common letters : "+String.valueOf(n1)+" "+String.valueOf(n2));
    }
    static char[] f={'F','L','A','M','E','S'};
    static int flames(int w){
        
        if(w<f.length){
            for(int i=w;i<f.length-1;i++){
                f[i]=f[i+1];
            }
            f=Arrays.copyOf(f,f.length-1);
        }
        else{
            
            while(w>=f.length){
                w-=f.length;
            }
            for(int i=w;i<f.length-1;i++){
                f[i]=f[i+1];
            }
            f=Arrays.copyOf(f,f.length-1);
        }
        System.out.println(String.valueOf(f));
        return w;
    }
    static boolean fun(){
        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Name-1 : ");
        String name1=(input.nextLine()).toUpperCase();
        n1=name1.toCharArray();
        System.out.print("Enter Name-2 : ");
        String name2=(input.nextLine()).toUpperCase();
        n2=name2.toCharArray();
        while(!fun()){
        removeCommonLetters();
        }
        int w=n1.length+n2.length;
        int add=0;
        System.out.println("Weight : "+w);
        while(f.length>1){
        add=flames(w-1+add);
        }
        System.out.println("\nOutput : "+f[0]);
    }
}


