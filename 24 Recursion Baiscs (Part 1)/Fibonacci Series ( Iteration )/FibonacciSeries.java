class FibonacciSeries {
    static void makeFibonacciSeries(int nums)
    {
        int a=0;
        int b=1;
        System.out.print(a+"\t"+b+"\t");

        for(int i=0; i<nums;i++)
        {
            int c=a+b;

            System.out.print(c+"\t");

            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        makeFibonacciSeries(5);
    }
}
