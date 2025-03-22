class ClearBits {
    static int clearBits(int num, int bits)
    {
        int bitMask=(~0)<<bits;

        return num & bitMask;

    }
    public static void main(String[] args) {
        System.out.println("Original number: "+31);
        System.out.println("After clearing the last 2 bits: "+clearBits(31, 2));
    }
}
