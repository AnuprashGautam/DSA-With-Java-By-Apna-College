import java.util.Scanner;

public class ContinueConcept {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number:");
            int num=sc.nextInt();
            System.out.println();

            if (num%10==0)
            {
                System.out.println("Skipped the number.");
                continue;
            }
            
            System.out.println("You entered:"+num);
        }
    }
}
