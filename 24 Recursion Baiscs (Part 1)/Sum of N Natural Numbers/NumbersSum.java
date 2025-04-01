class NumbersSum {
    static int numbersSum(int n)
    {
        int sum=0;

        if(n==1)            // Base Condition 1
        {
            return 1;
        }
        else{
            return numbersSum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 5 natural numbers is: "+numbersSum(5));
    }
}
