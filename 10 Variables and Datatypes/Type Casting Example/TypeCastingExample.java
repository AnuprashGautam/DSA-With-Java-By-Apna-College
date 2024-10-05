public class TypeCastingExample {
    public static void main(String[] args) {
        byte b=10;
    
        // Short s=10;              //Allowed
     
        // b=(b+1);                 //CE: Possible Lossy Conversion  Due to type promotion
    }
}
