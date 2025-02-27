public class MaxSubArraySum
{

    static void formPair(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int maxSubArraySum = Integer.MIN_VALUE;
            for (int j = i; j < array.length; j++) {
                int subArraySum=array[i];
                for (int k = i+1; k <= j; k++) {
                    subArraySum +=array[k];
                }

                if(subArraySum >= maxSubArraySum)
                    maxSubArraySum=subArraySum;

                System.out.print(subArraySum+"  ");
            }
            System.out.println(" MAX: "+ maxSubArraySum);
        }
    }


    public static void main (String[] args)
    {
        int[] array = {2,4,6,8,10};

        formPair(array);
    }
}