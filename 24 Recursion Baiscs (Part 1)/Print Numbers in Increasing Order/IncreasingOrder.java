public class IncreasingOrder
{
    static void printIncreasingNumbers(int n)
    {
        if(n==1)
        {
            System.out.print("1"+"\t");
        }
        else{
            printIncreasingNumbers(n-1);
            System.out.print(n+"\t");
        }
    }
    public static void main (String[] args)
    {
        printIncreasingNumbers(10);
    }
}