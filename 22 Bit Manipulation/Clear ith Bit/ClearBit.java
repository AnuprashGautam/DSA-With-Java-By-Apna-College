class ClearBit {
    static int clearBit(int num, int pos)
    {
        int bitMask=~(1<<pos);

        return num&bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Original number:"+48);
        System.out.println("After clearing the 5th bit:"+clearBit(48, 5));
    }
}
