package programming;
import java.util.Scanner;
public class sameRev {
    public int input;
    sameRev(){ 
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();    
    }
    public static void main(String args[]){
        sameRev client=new sameRev();
        System.out.println("is the number sam rev "+cond(client.input));
    }    
    static boolean cond(int input){ 
        int rev=0;
        int input1=input;
        while(input>0){ 
            rev=input%10+(rev*10);
            input/=10;
        }
        return rev==input1? true: false;
    }
}
