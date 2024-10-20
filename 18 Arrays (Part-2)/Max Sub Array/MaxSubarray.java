public class MaxSubarray 
{
    static void printSubarray(int[] arr)
    {
        int ts=0;
        for(int i=0; i<arr.length;i++)                      // To iterate over the element of the array 
        {
            int max=Integer.MIN_VALUE;
            for (int j=i;j<arr.length;j++)                  // To iterate over the array from i to last to print the sub array.
            {   
                int subArraySum=arr[i];
                for (int k=i;k<j;k++)                       // To actually print the subarrays sum.
                {
                    subArraySum+=arr[k+1];
                }
                ts++;
                if(subArraySum>max)
                    max=subArraySum;
            }
            System.out.println(max);
        }
        System.out.println("Total number of subarrays is:"+ts);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        printSubarray(arr);
    }
}
