package FOR_SCOOL;
import java.util.*;
class Solution{ 
    public static void main (String args[]){ 
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(removeW(n));
    } 
    public static String removeW(String n){ 
        StringBuilder flag=new StringBuilder();
        char[] charArray = n.toCharArray();
        for(char ch: charArray){ 
            if(!Character.isWhitespace(ch)){
                flag.append(ch);
            }
        }
    return flag.toString();
    } 
}
















