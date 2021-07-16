package FOR_SCOOL;
import java.util.*;
public class palindrone {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.println( " chal raha ha bsdk ");
        int n=sc.nextInt();
        sc.close();
        int temp=n;
        int r=0;
        while(n>0){ 
            r=(r*10)+n%10;
            n/=10;
        }   
        System.out.println(r==temp);
    }
}
