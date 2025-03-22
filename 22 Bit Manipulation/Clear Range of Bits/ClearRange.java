class ClearRange {
    static int clearRange(int num, int end, int start)
    {
        int a = (~0)<<(end+1);
        int b = (1<<start)-1;

        int bitMask = a | b;

        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println("Original Number: "+63);
        System.out.println("Clearing bits between 5th and 2nd bits: "+clearRange(-1, 4, 1));
    }
}
