import java.util.Scanner;

public class HRhombusPattern {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line= sc.nextInt();

        for (int i=1; i<=line; i++)
        {
            for (int j=line-i; j>=1;j--)        // For spaces
            {
                System.out.print("  ");
            }

            System.out.print("* ");     // First star of star line.

            for (int j=1; j<=line-2;j++)  //For printing the hollow effect of star line.
            {
                if(i==1 || i==line)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }

            System.out.print("* ");     // Last star of star line.

            System.out.println();
        }
    }
}
