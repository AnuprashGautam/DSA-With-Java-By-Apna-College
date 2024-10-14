import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalBinary(int dec)
    {
        int pow=0;
        int m= dec;
        int bin=0;
        int r;

        while(m!=0)
        {
            r=m%2;
            bin=bin+(int)(r*Math.pow(10,pow));
            m=m/2;
            pow++;
        }
        System.out.println("The decimal form of the binary number is:"+bin);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the decimal number:");
        int dec= sc.nextInt();

        decimalBinary(dec);
    }
}
