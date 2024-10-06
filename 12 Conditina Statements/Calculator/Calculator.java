import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number:");
        int a=sc.nextInt();

        System.out.print("Enter second number:");
        int b=sc.nextInt();

        System.out.print("Enter the operator:");
        char opr=sc.next().charAt(0);


        switch (opr) {
            case '+':
                System.out.println(a+b);
                break;
            
            case '-':
                System.out.println(a-b);
                break;
            
            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;
            
            case '%':
                System.out.println(a%b);
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}

