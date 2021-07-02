package FOR_SCOOL;
class Information{
    String value="--------------\n this is the parent class ";
}
public class inheritanceS extends Information{
    public static void main(String args[]){ 
            inheritanceS obj= new inheritanceS();
            System.out.println(" value from the parent class "+obj.value);
    }
}
