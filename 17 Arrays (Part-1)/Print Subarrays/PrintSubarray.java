public class PrintSubarray 
{
    static void printSubarray(int[] arr)
    {
        for(int i=0; i<arr.length;i++)                      // To iterate over the element of the array 
        {
            for (int j=i;j<arr.length;j++)                  // To iterate over the array from i to last to print the sub array.
            {   
                System.out.print("("+arr[i]);
                for (int k=i;k<j;k++)                       // To actually print the subarrays
                {
                    System.out.print(","+arr[k+1]);
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        printSubarray(arr);
    }
}
