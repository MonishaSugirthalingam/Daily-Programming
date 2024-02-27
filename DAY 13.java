import java.util.*;
/* AIM : DAY 13

Minimum distance between the maximum and minimum element of a given Array
Given an array A[] consisting of N elements, the task is to find the minimum distance between the minimum and the maximum element of the array.
Examples:  

Input: arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 8, 2} 
Output: 3 
Explanation: 
The minimum element(= 1) is present at indices {2, 4} 
The maximum element(= 8) is present at indices {7, 10}. 
The minimum distance between an occurrence of 1 and 8 is 7 – 4 = 3
Input: arr[] = {1, 3, 69} 
Output: 2 
Explanation: 
The minimum element(= 1) is present at index 0. 
The maximum element(= 69) is present at index 2. 
Therefore, the minimum distance between them is 2.

DATE : 28/02/24

*/

class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Array Size (N) : ");
        int n=input.nextInt();
        HashMap<Integer,ArrayList<Integer>> hash=new HashMap<>();
        int min=9999999;
        int max=-9999999;
        for(int i=0;i<n;i++){
        
            int val=input.nextInt();
            if(!hash.containsKey(val)){
                hash.put(val,new ArrayList<>());
            }
            hash.get(val).add(i);
            
            if(val<min){
                min=val;
            }
            if(val>max){
                max=val;
            }
        }
        
        ArrayList<Integer> minIndex=hash.get(min);
        ArrayList<Integer> maxIndex=hash.get(max);
        int mindis=999999;
        for(int i=0;i<minIndex.size();i++){
            for(int j=0;j<maxIndex.size();j++){
                int temp=Math.abs(minIndex.get(i)-maxIndex.get(j));
                if(temp<mindis){
                    mindis=temp;
                }
            }
        }
        
        System.out.println("Minimum Distance is : "+mindis);
    }
}
