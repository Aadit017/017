package FOR_SCOOL;
import java.util.*;
public class technumber {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(String.valueOf(n).length()%2==0){ 
            int firstHalf=Integer.parseInt(String.valueOf(String.valueOf(n).subSequence(0,(String.valueOf(n).length()/2))));
            int secondHalf=Integer.parseInt(String.valueOf(String.valueOf(n).subSequence((String.valueOf(n).length()/2),(String.valueOf(n).length()))));
            System.out.println((firstHalf+ secondHalf)*(firstHalf+ secondHalf)==n? "tech number" : "aint a tech number");
        }
        
    }
}
