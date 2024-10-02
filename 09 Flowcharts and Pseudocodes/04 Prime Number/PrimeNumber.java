import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number:");
        int var=scanner.nextInt();

        int div=2;
        boolean flag=true;                          //For prime number its value is true.

        while (div<var)
        {
            if (var%div==0)
                flag=false;
            div+=1;
        }
        if (flag==true)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }
}
