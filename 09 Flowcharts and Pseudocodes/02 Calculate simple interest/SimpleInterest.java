import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the amount:");
        float principle=scanner.nextFloat();

        System.out.print("Enter the rate:");
        float rate=scanner.nextFloat();

        System.out.print("Enter the interest:");
        float time=scanner.nextFloat();

        float si=(principle*rate*time)/100;

        System.out.print("The simple interest is:"+si);

        scanner.close();
    }
}
