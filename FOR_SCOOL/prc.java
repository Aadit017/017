package FOR_SCOOL;
import java.util.*;
public class prc {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt(); 
        int fat=1;
        for(int i=1;i<=n; i++ ){
            fat*=i;
        }
        System.out.println(fat);
    }
}
