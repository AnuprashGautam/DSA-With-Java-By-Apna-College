public class TypePromotionExample
{
    public static void main (String[] args)
    {
        byte b=1;
        b++;                    //Type Promotion is not there.
        // b=b+1;                  // CE due to type promotion.
        // b+=1;                    // CE due to type promotion.

        System.out.println(b);
    }
}