import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of upper pyramid:");
        int height = sc.nextInt();

        // For the upper diamond pattern.

        int UHeight=height;
        for (int i = 0; i < UHeight; i++) {
            for (int j = height - i; j > 1; j--)       // for printing the spaces before the numbers.
            {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= 2*i+1; j++) {              // for writing the actual diamonds.
                System.out.print("* ");
            }
            System.out.println();
        }

        // For the lower diamond pattern.

        int LHeight=height-1;
        for (int i = 1; i <= LHeight; i++) {
            for (int j = 1; j <= i; j++)       // for printing the spaces before the numbers.
            {
                System.out.print("  ");
            }
        
            for (int j = 2*(LHeight-i)+1; j >= 1 ; j--) {              // for writing the actual diamonds.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}