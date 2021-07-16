package FOR_SCOOL;
import java.util.*;
import java.util.zip.Checksum;
public class positive {
    //! positive number program in java 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int checkSum=0;
        for(int i=1;i<n;i++){ 
            if(n%i==0){
                checkSum+=i;
                System.out.println(checkSum);
            }
        }
    System.out.println(checkSum==n);
    }
}

