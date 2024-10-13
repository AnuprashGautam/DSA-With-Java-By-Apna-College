import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line= sc.nextInt();

        for (int i=1; i<=line; i++)
        {
            int n=1;
            for (int j=1; j<=i;j++)
            {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}

