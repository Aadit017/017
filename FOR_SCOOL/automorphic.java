package FOR_SCOOL;
import java.util.*; 
public class automorphic {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        System.out.println(square);
        int last=Integer.parseInt(String.valueOf(String.valueOf(square).charAt(String.valueOf(square).length()-1)));
        int secondlast=Integer.parseInt(String.valueOf(String.valueOf(square).charAt(String.valueOf(square).length()-2)));
        System.out.println(((secondlast*10)+last)==n);
    }
}

//! string value has been done twice coz we cant werent able to parse , cause it was a char value . so we had to convert it into a string value 

