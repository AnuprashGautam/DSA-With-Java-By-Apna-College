import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the amount:");
        float amount=scanner.nextFloat();

        System.out.print("Enter the rate:");
        float rate=scanner.nextFloat();

        System.out.print("Enter the interest:");
        float interest=scanner.nextFloat();

        float si=(amount*rate*interest)/100;

        System.out.print("The simple interest is:"+si);

    }
}
