import java.util.Scanner;

public class ButterflyPattern {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of butterfly's wing:");
        int line= sc.nextInt();

        // Upper Half Wings

        for (int i=1; i<=line; i++)
        {
            //Left wing
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            //Spaces between the wings
            for (int j=line-i;j>=1;j--)
            {
                System.out.print("  ");    // For left wing space 
                System.out.print("  ");    // For right wing space
            }

            //Right wing
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Half Wings

        for (int i=line; i>=1; i--)
        {
            //Left wing
            for (int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }

            //Spaces between the wings
            for (int j=i;j<=line-1;j++)
            {
                System.out.print("  ");    // For left wing space 
                System.out.print("  ");    // For right wing space
            }

            //Right wing
            for (int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}