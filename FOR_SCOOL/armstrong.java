package FOR_SCOOL;
import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;
        int checkSum=0;
        while(n>0){ 
            int temp=n%10; 
            checkSum=checkSum+(temp*temp*temp);
            n/=10;
        }     
        System.out.println(checkSum==n1);
    }
}
