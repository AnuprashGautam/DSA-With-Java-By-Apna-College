import java.util.Scanner;

public class ZeroOneTrianglePattern {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line= sc.nextInt();

        for (int i=1; i<=line; i++)
        {
            for (int j=1; j<=i;j++)
            {
                if ((i%2==0 & j%2==0)|(i%2!=0 & j%2!=0))
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}