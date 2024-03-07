/* AIM :
Medium to Hard
Help the doctor
Sabarish, A doctor forms a grid where each cell represents the condition of a patient. 

The cell can take any of the three values as follows:

              1-The person is virus free

              2-The person is infected with the virus

               3-Empty cell

It takes one day for the virus to spread from one person to another. 

Every day any virus free person who is adjacent (4-directionally) to the infected person catches the disease.

Given the initial grid help the doctor to find the minimum number of days that must elapse until 

everyone has been infected. If this impossible return -1.

Example:-

Suppose the input grid is 2 1 1 

                                            1 1 3

                                            3 1 1

After day 1 the grid will be    2 2 1

                                                  2 1 3

                                                  3 1 1

After day 2 the grid  will be  2 2 2

                                                 2 2 3

                                                 3 1 1

 

After day 3 the grid will be 2 2 2

                                               2 2 3

                                               3 2 1

After day 4 the grid will be 2 2 2

                                               2 2 3

                                               3 2 2

So, the minimum number of days is 4

Input format:-

Numbers of row in the grid

Numbers of column in the grid

Contents of the grid(next row*column lines)

Output format:-

Minimum number of days required

DATE : 7/03/24
*/

import java.util.*;
public class Main
{
    static int[][] fun(int[][] arr,int r,int c,int i,int j){
        
        int[][] a=new int[r][c];
        
        for(int x=0;x<r;x++){
            for(int y=0;y<c;y++){
                a[x][y]=arr[x][y];
            }
        }
        
        if((i+1)<=r-1 && (i-1)>=0 && (j+1)<=c-1 && (j-1)>=0){
            if(a[i][j-1]==1){
                a[i][j-1]=2;
            }
            if(a[i][j+1]==1){
                a[i][j+1]=2;
            }
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
        }
        else if(i==0 && j==0){
            if(a[i][j+1]==1){
                a[i][j+1]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
        }        
        else if(i==0 && j==c-1){
            if(a[i][j-1]==1){
                a[i][j-1]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
        }        
        else if(i==r-1 && j==c-1){
            if(a[i][j-1]==1){
                a[i][j-1]=2;
            }
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
        }
        else if(i==r-1 && j==0){
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
            if(a[i][j+1]==1){
                a[i][j+1]=2;
            }
        }        
        else if(i>0 && j==0){
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
            if(a[i][j+1]==1){
                a[i][j+1]=2;
            }
        }        
         else if(i>0 && j==c-1){
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
            if(a[i][j-1]==1){
                a[i][j-1]=2;
            }
        }
         else if(i==0 && j<c-1){
            if(a[i][j-1]==1){
                a[i][j-1]=2;
            }
            if(a[i][j+1]==1){
                a[i][j+1]=2;
            }
            if(a[i+1][j]==1){
                a[i+1][j]=2;
            }
        }       
        else if(i==r-1 && j<c-1){
            if( a[i][j-1]==1){
                a[i][j-1]=2;
            }
            if( a[i][j+1]==1){
                a[i][j+1]=2;
            }
            if(a[i-1][j]==1){
                a[i-1][j]=2;
            }
        }
        return a;
    }
    static boolean changes(int[][] a,int[][] b,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=b[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter row and col value : ");
		int row=input.nextInt();
		int col=input.nextInt();
		int[][] grid=new int[row][col];
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        grid[i][j]=input.nextInt();
		    }
		}
		int count=0;
		int[][] New_grid=new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        if(grid[i][j]==2){
		            New_grid=fun(grid,row,col,i,j);
		            if(changes(New_grid,grid,row,col)){
		                count++;
		                grid=New_grid;
		            }
		        }
		    }
		}
		if(count==0){
		    System.out.println("\n"+(-1));
		}
		else{
		    System.out.println("\n"+count);
		}
	}
}
