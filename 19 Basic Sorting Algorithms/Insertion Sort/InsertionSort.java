class InsertionSort {
    static int[] insertionSort(int[] nums)
    {
        int n=nums.length;

        for (int i = 1; i < n; i++) {
            int currentElement=nums[i];
            int previousIndex=i-1;

            // Finding the correct position
            while(previousIndex>=0 && nums[previousIndex]>currentElement)
            {
                nums[previousIndex+1]=nums[previousIndex];
                previousIndex--;
            }
            
            // Insertion
            nums[previousIndex+1]=currentElement;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {60,61,49,57,0,2};

        System.out.print("Before Sorting: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }

        int[] newNums=insertionSort(nums);

        System.out.print("\nAfter Sorting: ");
        for (int i : newNums) {
            System.out.print(i+" ");
        }
    }
}

