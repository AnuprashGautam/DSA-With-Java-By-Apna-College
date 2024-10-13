// Java only have call by value functionality, not call by reference.
// It means that the agruemnts are actually passed by copying. The change performed by the function is limited within its scope only.

public class SwapTwoNumbers
{
    static void swap (int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main (String[] args)
    {
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}