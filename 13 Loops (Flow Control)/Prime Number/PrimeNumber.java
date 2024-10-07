import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;

        while(true)
        {
            System.out.print("Enter the number:");
            number=sc.nextInt();
            int count=0;
            int i=1;

            while(i<=number)
            {
                if(number%i==0)
                    count++;
                i++;
            }
            if(count==2)
                System.out.println("Prime");
            else if(count==1)
                System.out.println("Neither prime nor commposite");
            else
                System.out.println("The number is composite. Try again.");
        }
    }
}
