import java.util.*;

/* AIM :
       In the ocean there was x number of fishes you need to find which fish has lesser weight than others 

       Input format 
       X number of fishes in the ocean
       Iteration over x to get each fish's weight

       X=10
       Weight of each fish's=[100,200,70,29,33,30,400,180,30,40,55]
       
       Output:
       Return a value for Maximum fish weight and minimum fish weight
       Max=400
       Min=29
       
       Armstrong Number Program 
       Write a program to find a given number is Armstrong number or not
       
    Date : 22/02/24
    
    Approach ==> Min && Max ==>Merge Sort==>less time complexity(O(nlogn));
    
*/

public class Main
{
    static void merge(int arr[],int l,int m,int r){
        int lena1=m-l+1;
        int lena2=r-m;
        
        int[] a1=new int[lena1];
        int[] a2=new int[lena2];
        
        for(int i=0;i<lena1;++i){
            a1[i]=arr[l+i];
        }
        for(int i=0;i<lena2;++i){
            a2[i]=arr[m+i+1];
        }
        
        int x=l,i=0,j=0;
        
        while(i<lena1 && j<lena2){
            if(a1[i]<=a2[j]){
                arr[x]=a1[i];
                i++;
            }
            else{
                arr[x]=a2[j];
                j++;
            }
            x++;
        }
        while(i<lena1){
            arr[x]=a1[i];
            i++;
            x++;
        }
         while(j<lena1){
            arr[x]=a2[j];
            j++;
            x++;
        }
        
    }
    static void sort(int[] arr,int l,int r){
        if(l<r){
            int m=(l+(r-1))/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    static int pow(int x,int n){
        int p=1;
        for(int i=0;i<n;i++){
            p=p*x;
        }
        return p;
    }
    static void armstrong(int num){
        //seperate the digits 
        ArrayList<Integer> a=new ArrayList<Integer>();
        int k=num;
        int count=0;//count the no.of digits
        while(k>0){
            a.add(k%10);
            k=k/10;
            count++;
        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum=sum+pow(a.get(i),count);//sum of powers
        }
        if(sum==num){
            System.out.println("Given Number is Armstrong");
        }
        else{
            System.out.println("Given Number is Not Armstrong");
        }
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("X = ");
	    int x=input.nextInt();
	    int arr[]=new int[x];
	    for(int i=0;i<x;i++){
	        arr[i]=input.nextInt();
	    }
		sort(arr,0,x-1);//merge sort
		System.out.println("Return a value for Maximum fish weight and minimum fish weight");
		System.out.println("Minimum is "+arr[0]);
		System.out.println("Maximum is "+arr[x-1]);
		
		System.out.println("To Check Given Number is Amstrong Or Not");
		System.out.print("Enter the Number : ");
		int num=input.nextInt();
		armstrong(num);
	}
}
