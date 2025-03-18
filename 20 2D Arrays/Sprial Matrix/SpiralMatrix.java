import java.util.Scanner;

class SpiralMatrix {
    static Scanner scanner= new Scanner(System.in);

    static void initializeMatrix(int[][] matrix)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        System.out.println("Enter the elments separated by space:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Elements entered successfully.\n");
    }

    static void printSprialMatrix(int[][] matrix)
    {
        int startingRow=0;
        int endingRow=matrix.length-1;

        int startingColumn=0;
        int endingColumn=matrix[0].length-1;

        while(startingRow<=endingRow && startingColumn<=endingColumn)
        {
            // Printing the top row
            for (int i = startingColumn; i < endingColumn; i++) {
                System.out.print(matrix[startingRow][i]+"  ");
            }

            // Pringting the right column
            for (int i = startingRow; i < endingRow; i++) {
                System.out.print(matrix[i][endingColumn]+"  ");
            }

            // Printing the bottom row
            for (int i = endingColumn; i > startingColumn; i--) {
                System.out.print(matrix[endingRow][i]+"  ");
            }

            // Printing the left column
            for (int i = endingRow; i > startingRow; i--) {
                System.out.print(matrix[i][startingColumn]+"  ");
            }

            startingRow++;
            endingRow--;

            startingColumn++;
            endingColumn--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix=new int[5][5];

        initializeMatrix(matrix);

        printSprialMatrix(matrix);
    }
}
