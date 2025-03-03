class DuplicateElement {
    static boolean isDuplicate(int[] nums)
    {
        boolean isTwice= false;

        for(int i=0; i<nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j & nums[i]==nums[j])
                {
                    return true;
                }
            }
        }

        return isTwice;
    }

    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[]{ 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
