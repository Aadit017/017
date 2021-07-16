package FOR_SCOOL;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class revers {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        IntStream.rangeClosed(0,n.length()-1).forEach(i-> System.out.println(n.charAt((n.length()-1)-i)));
    }
}
