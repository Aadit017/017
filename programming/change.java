// this program is just basically going to change 
// the case of the word 
package programming;
import java.util.*; 
public class change {
    // data members given in the program 
    Scanner sc= new Scanner(System.in);
    public String str;
    public int len;
    public String newstr;
    change(){ 
        System.out.println("enter the word");
        str=sc.next();
    }
    public static void main(String args[]){ 
        change client =new change();
        client.inputWord(client.str);
    }
    void inputWord(String str){ 
        StringBuffer rever=new StringBuffer("");
        for(int i=0;i<str.length();i++){ 
            //str.charAt(i).isUpperCase() 
            rever.append(Character.isUpperCase(str.charAt(i))? Character.toLowerCase(str.charAt(i)) : 
            Character.toUpperCase(str.charAt(i)));
        }
    System.out.println(rever);
    }
}
