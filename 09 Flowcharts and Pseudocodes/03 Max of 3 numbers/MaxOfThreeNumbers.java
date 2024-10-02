import java.util.Scanner;

class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("First number:");
        int a=scanner.nextInt();

        System.out.print("Second number:");
        int b=scanner.nextInt();

        System.out.print("Third number:");
        int c=scanner.nextInt();

        System.out.print("The greatest number is:");

        if (a>b){
            if (a>c)
                System.out.print(a);
            else    
                System.out.print(c);
        }
        else{
            if(b>c)
                System.out.print(b);
            else
                System.out.print(c);
        }
    }
}
