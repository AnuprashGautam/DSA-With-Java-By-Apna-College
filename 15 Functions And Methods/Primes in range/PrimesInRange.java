import java.util.Scanner;

public class PrimesInRange 
{
    public static boolean checkPrime(int a)
    {
        if(a==2)
            return true;
        
        for (int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number upto which you want to print the prime numbers:");
        int limit=sc.nextInt();

        for (int i = 2; i <= limit; i++) {
            boolean flag=checkPrime(i);
            if(flag == true)
                System.out.print(i+" ");
        }
    }
}
