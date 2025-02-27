public class SubArraySum
{

    static void formPair(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i; j < array.length; j++) {
                int subArraySum=array[i];
                for (int k = i+1; k <= j; k++) {
                    subArraySum +=array[k];
                }
                System.out.print(subArraySum+"  ");
            }
            System.out.println();
        }
    }


    public static void main (String[] args)
    {
        int[] array = {2,4,6,8,10};

        formPair(array);
    }
}
