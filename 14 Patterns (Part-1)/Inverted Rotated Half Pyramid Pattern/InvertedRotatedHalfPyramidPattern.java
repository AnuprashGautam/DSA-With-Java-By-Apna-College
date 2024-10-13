//                                                          *
//                                                        * *
//                                                      * * * 
//                                                    * * * *
//                                                  * * * * *


import java.util.Scanner;

public class InvertedRotatedHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line = sc.nextInt();

        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {              //For printing the spaces.
                System.out.print("  ");
            }

            for (int j = 0; j <= line-i; j++) {               //For printing the star.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}