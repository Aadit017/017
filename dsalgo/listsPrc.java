package dsalgo;
import java.util.*;
public class listsPrc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        // add method same as that of js , adds elements into the array 
        list.add(145);        
        list.add(125876);        
        list.add(123);        
        list.add(1452);
        //!--------------
        // get method is used to get the elements 
        System.out.println(list.get(0));
        //set method is used to change the elements 
        list.set(0, 1000);
        System.out.println(list.get(0));
    } 
}
