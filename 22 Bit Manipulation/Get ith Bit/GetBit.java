class GetBit {
    static int getBit(int num, int pos)
    {
        int bitMask=1<<pos;

        if((num & bitMask)==0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("What is the 5th bit in the number 33: "+getBit(33, 5));
    }
}
