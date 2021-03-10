package programming;
import java.util.Scanner;
public class triangular {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        boolean cond=false;
        for(int i=0;i<=n;i++){ 
            sum+=i;
            if(sum==n){ 
                System.out.println("triangular");
                cond=true;
                break; 
            }
        }
    if(cond==false){
        System.out.println("not a triangular number");
    }
    }
}
