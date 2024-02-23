/*
Day 10:
Name changing program 2
The task is to sort the string according to the frequency of each char, in ascending order. If two chars have the same count, then they are sorted in alphabetical order.
Example 
Input bharath
output : brtaahh
Date : 23/02/24
Approach : 
         HashMap (For Frequency Finding)
         Merge sort(For Sorting)
*/
import java.util.*;
public class Main
{
    
    static void merge(char[] k,int[] v,int l,int m,int r){
        int l1=m-l+1;
        int l2=r-m;
        
        char k1[]=new char[l1];
        int v1[]=new int[l1];
        
        char k2[]=new char[l2];
        int v2[]=new int[l2];
        
        for(int i=0;i<l1;i++){
            k1[i]=k[l+i];
            v1[i]=v[l+i];
        }
        
        for(int i=0;i<l2;i++){
            k2[i]=k[m+i+1];
            v2[i]=v[m+i+1];
        }
        
        int i=0,j=0,x=l;
        
        while(i<l1 && j<l2){
            if(v1[i]<=v2[j]){
                v[x]=v1[i];
                k[x]=k1[i];
                i++;
            }
            else{
                v[x]=v2[j];
                k[x]=k2[j];
                j++;
            }
            x++;
        }
        
        while(i<l1){
            v[x]=v1[i];
            k[x]=k1[i];
            i++;
            x++;
        }
        
        while(j<l2){
            v[x]=v2[j];
            k[x]=k2[j];
            j++;
            x++;
        }
    }
    static void sort(char[] k,int[] v,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            sort(k,v,l,m);
            sort(k,v,m+1,r);
            merge(k,v,l,m,r);
        }
        
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name=(input.nextLine()).toLowerCase();
		HashMap<Character,Integer> freq=new HashMap<>();
		for(int i=0;i<name.length();i++){
		    if(!freq.containsKey(name.charAt(i))){
		        freq.put(name.charAt(i),1);
		    }
		    else{
		        freq.put(name.charAt(i),freq.get(name.charAt(i))+1);
		    }
		}
		char[] k=new char[freq.size()];
		int[] v=new int[freq.size()];
		int count=0;
	    for(Map.Entry<Character,Integer> i : freq.entrySet()){
	        k[count]=i.getKey();
	        v[count]=i.getValue();
	        count++;
	    }
	    int n=k.length;
	    /*//bubble sort
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(v[i]>v[j]){
	                int t=v[i];
	                char t1=k[i];
	                v[i]=v[j];
	                k[i]=k[j];
	                v[j]=t;
	                k[j]=t1;
	            }
	        }
	    }*/
	   
	    //merge sort
	    sort(k,v,0,n-1);
	    /*//before alphabetical order
	    for(int i=0;i<n;i++){
	        for(int j=0;j<v[i];j++){
	            System.out.print(k[i]);
	        }
	    }
	    System.out.println();
	    */
	    for(int i=0;i<n-1;i++){
	        if(v[i]==v[i+1] && k[i]>k[i+1]){
	            int t=v[i];
	            char t1=k[i];
	            v[i]=v[i+1];
	            k[i]=k[i+1];
	            v[i+1]=t;
	            k[i+1]=t1;
	        }
	    }
	    //After alphabetical order
	    for(int i=0;i<n;i++){
	        for(int j=0;j<v[i];j++){
	            System.out.print(k[i]);
	        }
	    }
	}
}
