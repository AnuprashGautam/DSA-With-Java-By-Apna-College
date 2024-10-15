public class LargestInArray {
    public static int largestInArray(int[] arr) 
    {
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > largest)
                largest=arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("The largest element in the array is:" + largestInArray(array));
    }
}