import java.util.Scanner;

public class ReportCardExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the percentage:");
        float per=sc.nextFloat();

        String result=per>=33.0?"Pass":"Fail";

        System.out.println("The result is:"+result);
    }
}
