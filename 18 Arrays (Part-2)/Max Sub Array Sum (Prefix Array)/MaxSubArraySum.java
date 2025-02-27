public class MaxSubArraySum
{

    static void findMaxSubArraySum(int[] array)
    {
        int maxSubArraySum = Integer.MIN_VALUE;
        int subArraySum=0;

        // Constructing the prefix array.
        int[] prefixArray= new int[array.length];
        prefixArray[0]=array[0];

        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i]=prefixArray[i-1]+array[i];
        }

        for (int i = 0; i < array.length; i++) 
        {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                
                subArraySum = (start==0) ? prefixArray[end] : prefixArray[end]-prefixArray[start-1];

                if(subArraySum >= maxSubArraySum)
                    maxSubArraySum=subArraySum;

            }
        }
        System.out.println("Maximum sub array in the whole parent array: "+ maxSubArraySum);
    }


    public static void main (String[] args)
    {
        int[] array = {2,4,6,8,10};

        findMaxSubArraySum(array);
    }
}