class SelectionSort {
    static int[] selectionSort(int[] nums)
    {
        int n=nums.length;

        for(int turn=0; turn<n-1; turn++ )
        {
            int minPos=turn;
            for(int j=turn+1; j<n; j++)             // Selecting the minimum element from unsorted array
            {
                if(nums[j]<nums[minPos])
                {
                    minPos=j;
                }
            }

            // Swapping
            int temp=nums[minPos];
            nums[minPos]=nums[turn];
            nums[turn]=temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {60,61,49,57,0,2};

        System.out.print("Before Sorting: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }

        int[] newNums=selectionSort(nums);

        System.out.print("\nAfter Sorting: ");
        for (int i : newNums) {
            System.out.print(i+" ");
        }
    }
}
