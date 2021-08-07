package FOR_SCOOL;
import java.util.*;
public class sunny {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkPerf(n+1)==true ? " is a perfect number " : " aint a perfect number "); 
    }    
    public static boolean checkPerf(int n){
        for(int i=2;i<n;i++){ 
            if(i*i==n){ 
                return true;
            }
        }
    return false;
    }

}
