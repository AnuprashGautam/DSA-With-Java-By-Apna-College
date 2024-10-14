import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome(int num)
    {
        int rev=0;
        int m=num;
        int r;

        while(m!=0)
        {
            r=m%10;
            rev=10*rev+r;
            m/=10;
        }

        if (rev==num)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not palindrome.");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();

        checkPalindrome(num);
    }
}
