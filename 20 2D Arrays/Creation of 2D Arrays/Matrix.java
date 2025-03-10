import java.util.Scanner;

class Matrix {
    static Scanner scanner= new Scanner(System.in);

    static void initialixeMatrix(int[][] matrix)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        System.out.println("Enter the elments separated by space:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Elements entered successfully.");
    }

    static void printMatrix(int[][] matrix)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        System.out.println("Printing the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void smallestElementMatrix(int[][] matrix)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        int min=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min=Math.min(min, matrix[i][j]);
            }
        }
        System.out.println("The smallest element in the matrix is:"+min);
    }

    static void largestElementMatrix(int[][] matrix)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max=Math.max(max, matrix[i][j]);
            }
        }
        System.out.println("The largest element in the matrix is:"+max);
    }

    static String searchMatrix(int[][] matrix, int key)
    {
        int n=matrix.length;    // Row
        int m=matrix[0].length; // Column

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(key==matrix[i][j])
                    return "Element found at ("+i+","+j+")";
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        int[][] matrix=new int[3][3];

        initialixeMatrix(matrix);

        printMatrix(matrix);

        smallestElementMatrix(matrix);

        largestElementMatrix(matrix);

        System.out.println(searchMatrix(matrix, 10));
    }
}
