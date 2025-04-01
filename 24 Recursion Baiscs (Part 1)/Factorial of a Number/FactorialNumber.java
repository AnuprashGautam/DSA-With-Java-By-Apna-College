public class FactorialNumber
{
    static int factorialNumber(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * factorialNumber(n-1);
    }
    public static void main (String[] args)
    {
        System.out.println("The factorial of 10 is:"+factorialNumber(10));
    }
}
