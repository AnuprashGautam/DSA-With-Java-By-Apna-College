public class BinarySearch {
    static int binarySearchMethod(int[] arr,int key) {
        int start=0, end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if (key==arr[mid])                  // Key is present actually in the middle.
                return mid;
            else if (key>arr[mid])                      // Key is present in the right side.
                start=mid+1;
            else if (key<arr[mid])                      // Key is present in the left side.
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Must be sorted.
        int key = 6; // The element that you want to search.
        System.out.println("The element " + key + " was found at:" + BinarySearch.binarySearchMethod(arr, key));
    }
}
