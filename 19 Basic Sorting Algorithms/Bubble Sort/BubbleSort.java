class BubbleSort {
    static int[] bubbleSort(int[] nums)
    {
        int n= nums.length;

        for (int turn = 0; turn < n-1; turn++) {
            int swapCount=0;
            for (int j = 0; j < (n-1-turn); j++) {
                if(nums[j]>nums[j+1])
                {
                    // Swapping
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                    swapCount++;
                }
            }
            if(swapCount==0)    // Array is already sorted.
            {
                return nums;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};

        System.out.print("Before Sorting: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }

        int[] newNums=bubbleSort(nums);

        System.out.print("\nAfter Sorting: ");
        for (int i : newNums) {
            System.out.print(i+" ");
        }
    }
}
