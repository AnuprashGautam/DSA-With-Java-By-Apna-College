public class MaxSubArraySum
{

    static void formPair(int[] array)
    {
        int maxSubArraySum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i; j < array.length; j++) {
                int subArraySum=array[i];
                for (int k = i+1; k <= j; k++) {
                    subArraySum +=array[k];
                }

                if(subArraySum >= maxSubArraySum)
                    maxSubArraySum=subArraySum;

                System.out.print(subArraySum+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximum sub array in the whole parent array: "+ maxSubArraySum);
    }


    public static void main (String[] args)
    {
        int[] array = {2,4,6,8,10};

        formPair(array);
    }
}