import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Height of the pyramid:");
        int height=sc.nextInt();

        int temp=1;

        for (int i = 1; i <= height; i++) {
            for (int j=height-i;j>=1;j--)           // for printing the spaces before the numbers.
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {          //for writing the actual numbers.
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
