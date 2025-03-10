class CountingSort {
    static int[] countingSort(int[] nums)
    {
        // Finding the largest element of the array.
        int max=Integer.MIN_VALUE;
        for (int e: nums) {
            if(e>max)
                max=e;
        }
        
        // Declaring the count sort.
        int[] countSort=new int[max+1];
        countSort[0]=0;

        // Initializing the counting sort
        for (int e: nums) {
            countSort[e]++;
        }

        // Arragning the elements of nums array.
        int j=0;
        for (int i=0;i<countSort.length; i++) {
            while(countSort[i]>0)
            {
                nums[j++]=i;
                countSort[i]--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {60,61,49,57,0,2};

        System.out.print("Before Sorting: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }

        int[] newNums=countingSort(nums);

        System.out.print("\nAfter Sorting: ");
        for (int i : newNums) {
            System.out.print(i+" ");
        }
    }
}

