public class IsSorted
{
    static boolean isSorted(int[] arr, int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        else if(arr[i] > arr[i+1])
        {
            return false;
        }
        else{
            return isSorted(arr, i+1);
        }

    }
    public static void main (String[] args)
    {
        int arr[]={1,2,7,4,5};
        System.out.println("Is this array sorted? "+isSorted(arr, 0));
    }
}
