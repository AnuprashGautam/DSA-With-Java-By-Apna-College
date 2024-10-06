import java.util.*;

public class IfElseConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number:");
        int num = sc.nextInt();

        if (num <= 0)
            System.out.println("Number is less tahn or equal to 0.");

        else if(num <= 10)
            System.out.println("Number is less than or equal to  10.");

        else if(num <= 50)
            System.out.println("Number is less than or equal to  50.");

        else if(num <= 100)
            System.out.println("Number is less than or equal to  100.");

        else
            System.out.println("Number is larger than 100.");
    }
}