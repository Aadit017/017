package programming;

public class sumOfTwo {
    public static void main(String args[]){ 
        // sum of first ten natural numbers 
        int sum=tenSum(10);
        System.out.println("total sum is "+sum);
    }   
    static int tenSum(int n){ 
        if(n==0){ 
            return 0;
        }
        return n+tenSum(n-1);
    } 
}
