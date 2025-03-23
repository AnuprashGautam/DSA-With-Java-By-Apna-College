public class SwapNumbers
{
    static void swapNumbers(int a, int b)
    {
        System.out.println("Before Swapping: "+a+", "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping: "+a+", "+b);

    }
    public static void main (String[] args)
    {
        swapNumbers(10,20);
    }
}