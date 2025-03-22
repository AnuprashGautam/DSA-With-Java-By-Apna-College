class TotalSetBits {
    static int noOfSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n & 1) == 1)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of set bits in 15: "+noOfSetBits(15));
        System.out.println("Number of set bits in 16: "+noOfSetBits(16));
    }
}
