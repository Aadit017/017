/* 
1 2 3 
4 5 6 
7 8 9 
row,col=> 3,3  
*/ 
package programming;

import java.util.Scanner;

public class arrayUpper{ 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<3;i++){ 
            for(int j=0;j<3;j++){ 
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array now");
        for(int[] i:arr){
            for(int j:i){ 
                System.out.print(" "+j);
            }
        System.out.println("\n");
        }
    System.out.println(" \n now the asked cond ");
    for(int i=0;i<3;i++){
        for(int j=i;j<3;j++){
            System.out.print(" "+arr[i][j]);
        }
    System.out.println("\n");
       }
    }
}