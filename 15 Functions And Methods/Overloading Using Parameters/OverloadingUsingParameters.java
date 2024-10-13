public class OverloadingUsingParameters {
    public static int summation(int a, int b)
    {
        return a+b;
    }

    public static int summation(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 10 and 20 is:"+ OverloadingUsingParameters.summation(10,20));
        System.out.println("The sum of 10.10 and 20.10 is:"+ OverloadingUsingParameters.summation(10,20,30));
    }
}