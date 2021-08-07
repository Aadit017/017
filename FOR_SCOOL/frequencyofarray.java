package FOR_SCOOL;
import java.util.*;
public class frequencyofarray {

    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        List<Character> clist=new ArrayList<>();
        char[] flag=n.toCharArray();
        for(int i=flag.length-1;i>=0;i--){ 
            System.out.println(flag[i]);
        }   
        // System.out.println(Arrays.toString(clist.toArray()));
    }
}
