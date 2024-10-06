import java.util.*;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your income:");
        float inc=sc.nextFloat();

        double tax=0;

        if (inc<=500_000)
            tax=0;

        else if(inc>500_000 & inc<10_00_000)
            tax=inc*0.10;

        else
            tax=inc*0.30;

        System.out.println("The tax is:"+tax);
    }
}
