import java.util.Scanner;

public class HollowRectanglePattern
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line= sc.nextInt();
        int lineCounter=1;

        for (int i = 1; i <=line; i++) {
            if (lineCounter==1 || lineCounter==line)  
            {
                for (int j = 1; j <= line; j++) {
                    System.out.print("* ");                    
                }
                System.out.println();
                lineCounter++;
            } 

            else{
                System.out.print("* ");
                for (int j = 1; j <= line-2; j++) {
                    System.out.print("  ");                          // Printing the empty spaces.
                }
                System.out.println("*");
                lineCounter++;
            }
        }

        System.out.println();
    }
}