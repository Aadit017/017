package s;
import java.util.*;
public class lc
{  
public static void main(String args[])   
{  
  Scanner sc =new Scanner(System.in);
    int a =sc.nextInt();
    int max, step, lcm = 0;
    int b=sc.nextInt();
    if(a > b){
        max = step = a;
     }
     else{
        max = step = b;
     }

     while(a!= 0) {
        if(max % a == 0 && max % b == 0) {
           lcm = max;
           break;
        }
        max += step;
     }
System.out.println(lcm);
    } 
} 