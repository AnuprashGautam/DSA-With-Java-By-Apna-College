class TransposeMatrix {
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

    static int[][] transposeMatrix(int[][] matrix)
    {
        int[][] tMatrix= new int[matrix[0].length][matrix.length];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                tMatrix[c][r]=matrix[r][c];
            }
        }

        return tMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix={{2,4,1,5},
                        {10,7,9,0},
                        {3,4,1,2}};

        printMatrix(matrix);

        matrix=transposeMatrix(matrix);

        printMatrix(matrix);
    }
}
