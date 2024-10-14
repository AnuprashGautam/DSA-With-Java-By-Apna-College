import java.util.Scanner;

public class BinaryToDecimal {
    public static void binayDecimal(int bin)
    {
        int pow=0;
        int m= bin;
        int dec=0;
        int r=1;

        while(m!=0)
        {
            r=m%10;
            dec=dec+(int)(r*Math.pow(2,pow));
            m=m/10;
            pow++;
        }
        System.out.println("The decimal form of the binary number is:"+dec);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the binary number:");
        int bin= sc.nextInt();

        binayDecimal(bin);
    }
}
