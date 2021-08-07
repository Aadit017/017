package FOR_SCOOL;
// ! 145-> 1!+4!+5!==145
import java.util.*;
public class peterson {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int sum=0; 
        while(n>0){ 
            sum+=factSum(n%10);
            n/=10;
        }
        System.out.println(sum==n);
    }    
    public static int factSum(int n){ 
        int sum=0;
        for(int i=2; i<n;i++){ 
            if(n%i==0){ 
                sum*=i;
            }
        }
    return sum;
    }
}
