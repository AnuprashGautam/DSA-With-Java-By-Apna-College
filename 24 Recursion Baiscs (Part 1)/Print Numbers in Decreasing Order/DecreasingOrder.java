public class DecreasingOrder
{
    static String printNumber(int n)
    {
        if(n==1)
        {
            return "1";
        }
        else{
            return n+"\t"+printNumber(n-1);
        }
    }
    public static void main (String[] args)
    {
        System.out.println(printNumber(10));
    }
}