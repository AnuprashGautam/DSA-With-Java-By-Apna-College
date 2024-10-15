public class LinSearch
{
    public static int linearSearch(int[] arr, int key)
    {
        for (int i=0; i<arr.length;i++)
        {
            if( arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main (String[] args)
    {
        int array[]={1,2,3,4,5,6,7,8,9,10};

        if (linearSearch(array, 5)==-1)
            System.out.println("The key is not present in the array.");
        else
            System.out.println("The key is present in the array at:"+linearSearch(array, 5));
    }
}