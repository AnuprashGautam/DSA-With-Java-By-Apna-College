public class FirstOccurence
{
    static int firstOccurence(int[] arr, int target, int start)
    {
        if(start==arr.length)
        {
            return -1;
        }
        else if(target==arr[start])
        {
            return start;
        }
        return firstOccurence(arr, target, start+1);
    }

    public static void main (String[] args)
    {
        int[] arr={1,2,3,4,6,7,8,5};

        System.out.println("Is there exists 5 in this array? "+firstOccurence(arr,5,0));
    }
}
