import java.util.Scanner;

class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a=scanner.nextInt();

        System.out.println("Enter the second number:");
        int b=scanner.nextInt();

        int sum=a+b;

        System.out.println("The sum is:"+sum);

        scanner.close();
    }
}