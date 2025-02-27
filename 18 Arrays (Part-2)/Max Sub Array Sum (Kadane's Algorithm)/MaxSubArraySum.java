public class MaxSubArraySum
{

    static void findMaxSubArraySum(int[] array)
    {
        int currentSum=0;
        int maxSubArraySum=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if(currentSum<0){
                currentSum=0;
            }

            maxSubArraySum = Math.max(currentSum, maxSubArraySum);
        }
        System.out.println("Maximum sub array in the whole parent array: "+ maxSubArraySum);
    }


    public static void main (String[] args)
    {
        int[] array = {-2,-3,4,-1,-2,1,5,-3};

        findMaxSubArraySum(array);
    }
}