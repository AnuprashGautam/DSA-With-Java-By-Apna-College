import java.util.Scanner;

public class FallThroughExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your current location(in m):");
        int dis=sc.nextInt();

        //----First Quarter-----|-------Second Quarter------|-------Third Quarter---------|---------Fourth Quarter---------

        String quarter;

        if(dis==0)
            quarter="Start";
        else if (dis<=250)
            quarter="First";
        else if (dis<=500)
            quarter="Second";
        else if (dis<=750)
            quarter="Third";
        else
            quarter="Fourth";


        switch (quarter) {
            case "Start":
                System.out.println("First quarter not reached.");
            
            case "First":
                System.out.println("Second quarter not reached.");

            case "Second":
                System.out.println("Third quarter not reached.");
            
            case "Third":
                System.out.println("Fourth quarter not reached.");

            default:
                System.out.println("You completed all the 4 quarters or you are in the last quarter.");
        }

    }
}
