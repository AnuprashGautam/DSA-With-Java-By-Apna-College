import java.util.Scanner;

public class OptimizedWay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;

        while(true)
        {
            System.out.print("Enter the number:");
            number=sc.nextInt();
            boolean flag=true;

            for(int i=2;i<=Math.sqrt(number);i++)
            {
                if(number%i==0)
                    flag=false;
            }
            if(number==1)
                System.out.println("Neither prime nor composite.");
            else if(number==2)
                System.out.println("Prime");
            else if(flag==false)
                System.out.println("Not Prime");
            else if(flag==true)
                System.out.println("Prime");
            else
                System.out.println("Invalid input.");
        }
    }
}
