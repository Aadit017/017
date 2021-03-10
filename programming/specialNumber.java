// special number program in java
package programming;
import java.util.*;
public class specialNumber {
    Scanner sc=new Scanner(System.in);
    public int input;
    specialNumber(){ 
        input=sc.nextInt();
    }
    public static void main(String args[]){ 
        specialNumber client= new specialNumber();
        boolean checkForCond=client.checkS(client.input);
        System.out.println("number special "+checkForCond);
    }
    boolean checkS(int input){
        while(true){ 
            int n=0;
            while(input>0){
                n=input%10+n;
                input=input/10;
            }
            if (n<=9){ 
                return n==1 ? true :false;
            }
        input=n;
        }
    }
} 