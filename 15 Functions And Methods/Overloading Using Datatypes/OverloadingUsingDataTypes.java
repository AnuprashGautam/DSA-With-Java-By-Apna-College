public class OverloadingUsingDataTypes {
    public static int summation(int a, int b)
    {
        return a+b;
    }

    public static float summation(float a, float b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 10 and 20 is:"+ OverloadingUsingDataTypes.summation(10,20));
        System.out.println("The sum of 10.10 and 20.10 is:"+ OverloadingUsingDataTypes.summation(10.10f,20.10f));
    }
}

