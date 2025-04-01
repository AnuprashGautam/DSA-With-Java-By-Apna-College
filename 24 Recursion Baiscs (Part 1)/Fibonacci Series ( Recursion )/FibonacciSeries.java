class FibonacciSeries {
    // We have to calculate the nth fibonacci number.
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("The fibonaaci number at 4th position is: "+fibonacci(4));
    }
}
