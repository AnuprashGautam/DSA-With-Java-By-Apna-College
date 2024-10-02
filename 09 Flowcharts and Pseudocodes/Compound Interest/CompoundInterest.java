import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principle = scanner.nextFloat();

        System.out.print("Enter the annual interest rate (in percentage): ");
        float rate = scanner.nextFloat() / 100;  // convert to decimal

        System.out.print("Enter the time (in years): ");
        float time = scanner.nextFloat();

        System.out.print("Enter the number of times interest is compounded per year: ");
        float timePeriodElapsed = scanner.nextFloat();

        float amount = principle * (float)Math.pow((1 + rate / timePeriodElapsed), (timePeriodElapsed * time));

        System.out.println("The final amount is: " + amount);

        scanner.close();
    }
}
