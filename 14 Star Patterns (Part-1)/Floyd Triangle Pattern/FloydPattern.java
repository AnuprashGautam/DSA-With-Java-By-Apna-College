                                                                    // 1
                                                                    // 2 3
                                                                    // 4 5 6
                                                                    // 7 8 9 10
                                                                    // 11 12 13 14 15

import java.util.Scanner;

public class FloydPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line = sc.nextInt();
        int temp=1;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i ;j++) {            
                System.out.print(temp++ +" ");
            }
            System.out.println();
        }
    }
}