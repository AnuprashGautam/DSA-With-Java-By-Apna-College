class LastOccurence
{
    static int lastOccurence(int[] arr, int target, int start)
    {
        if(start==arr.length)
        {
            return -1;
        }

        int isFound=lastOccurence(arr, target, start+1);

        if(isFound==-1 && arr[start]==target)
        {
            return start;
        }

        return isFound;
    }
    public static void main (String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,7};
        System.out.println("What is the last occurence of 7 in the array? "+lastOccurence(arr, 7, 0));
    }
}