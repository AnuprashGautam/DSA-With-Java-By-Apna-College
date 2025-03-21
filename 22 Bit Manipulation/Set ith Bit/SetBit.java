class SetBit {
    static int setBit(int num, int pos)
    {
        int bitMask=1<<pos;

        return num|bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Original Number:"+16);
        System.out.println("Setting the 5th bit:"+setBit(16, 5));
    }
}
