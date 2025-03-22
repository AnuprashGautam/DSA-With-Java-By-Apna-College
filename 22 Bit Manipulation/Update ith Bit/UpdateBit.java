public class UpdateBit
{
    static int updateBit(int num, int pos, int newBit)
    {
        // Clearing the ith bit first.
        int bitMask=~(1<<pos);
        num=num&bitMask;

        // Now setting the newBit
        bitMask=newBit<<pos;
        return num | bitMask;
    }

    public static void main (String[] args)
    {
        System.out.println("Original number: "+31);
        System.out.println("Updating 3rd bit to 0: "+updateBit(31, 3, 0));
        System.out.println("Udpating 5th bit to 1: "+updateBit(31, 5, 1));
    }
}