import java.util.Scanner;

public class DigitSum {
    public static void checkPalindrome(int num)
    {
        int total=0;
        int m=num;
        int r;

        while(m!=0)
        {
            r=m%10;
            total+=r;
            m/=10;
        }
        System.out.println("The sumamtion of the digits of the numer:"+num+" is:"+total);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();

        checkPalindrome(num);
    }
}
