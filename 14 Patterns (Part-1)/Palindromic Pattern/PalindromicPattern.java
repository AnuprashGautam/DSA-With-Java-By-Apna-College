import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Height of the pyramid:");
        int height=sc.nextInt();

        for (int i = 1; i <= height; i++) {
            int temp = i;
            for (int j=height-i;j>=1;j--)           // for printing the spaces before the numbers.
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2*(i-1)+1; j++) {          //for writing the actual numbers.
                int mid = (2*(i-1)+1)/2;
                if(j<=mid)
                    System.out.print(temp-- +" ");
                else
                    System.err.print(temp++ +" ");
            }
            System.out.println();
        }
    }
}
