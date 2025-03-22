class FastExponentiation {
    static int fastExponentiation(int a, int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)==1)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("The value of 2 raise to the power 5: "+fastExponentiation(2, 5));
        System.out.println("The value of 2 raise to the power 10: "+fastExponentiation(2, 10));
    }
}
