
import java.util.*;
public class Solution {
  public static void main(String args []){
    int a=1;
    int b=1;
    int z=0;  
   int n=22; // this is the input
  z+=fib(a,b,n);
  } // this is where the main stuff happens
  static int fib(int a,int b,int n){ 
        if(a>n){ 
            return 0;
        }else{ 
            System.out.println(a);
            int tem=a;
            a=b; 
            b=tem+b;
            return fib(a,b,n);
        }
    }
}

