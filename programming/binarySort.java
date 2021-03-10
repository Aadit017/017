package programming;

import java.util.Scanner;

public class binarySort {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<5;i++){ 
        arr[i]=sc.nextInt();
    }
    System.out.println("to find this number ");
    int n=sc.nextInt();
    int high=4;
    int mid=0,low=0;
    boolean cond=false;
    
        while(high>0){ 
            mid=(low+high) >> 1 ;
            low=arr[mid]>n?mid : low;
            high=arr[mid]>n?high : mid;
            if (arr[mid]==n){ 
                System.out.println("element found at "+mid+1+"for lay man people");
                cond=true;
                break;
            }
        }
        if(cond==false){ 
            System.out.println("not found ");
        }
}   
}
