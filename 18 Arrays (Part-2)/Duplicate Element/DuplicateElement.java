import java.util.Arrays;

class DuplicateElement {
    static boolean isDuplicate(int[] nums)
    {
        boolean isTwice= false;

        Arrays.sort(nums);      // Sorting the array.

        for(int i=0; i<nums.length-1; i++)
        {
            if((nums[i]^nums[i+1])==0)
            {
                return true;
            }
        }

        return isTwice;
    }

    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[] { 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }
}
