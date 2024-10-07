// This code will keep on accepting the numbers until we don't enter the multiple of 10.

import java.util.Scanner;

public class BreakConcept {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number:");
            int num=sc.nextInt();
            System.out.println();

            if (num%10==0)
                break;
            
            System.out.println("You entered:"+num);
        }
        System.out.println("You entered the multiple of 10.");
    }
}
