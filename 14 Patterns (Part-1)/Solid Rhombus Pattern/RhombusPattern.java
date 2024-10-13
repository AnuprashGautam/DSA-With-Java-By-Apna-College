import java.util.Scanner;

public class RhombusPattern {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line= sc.nextInt();

        for (int i=1; i<=line; i++)
        {
            for (int j=line-i; j>=1;j--)
            {
                System.out.print("  ");
            }

            for (int j=1; j<=line;j++)  //For printing the star lines
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}