class DiagonalSum {
    static void diagonalSum(int[][] matrix)
    {
        int n=matrix.length;
        int sum=0;

        // Primary diagonal sum
        for (int i = 0; i < n; i++) {
            sum+=matrix[i][i];
        }

        // Secondary diagonal sum
        for (int r=0,c=n-1; r<n & c>=0; r++,c--) {
            sum+=matrix[r][c];
        }

        if(n%2!=0)                  // Matrix contain the odd num of rows and columns i.e. special case.
        {
            sum-=matrix[n/2][n/2];
        }

        System.out.println("The sum of diagonal elements is:"+sum);
    }

    public static void main(String[] args) {
        int[][] matrix={{10,20,30},             // Matrix should be summetric.
                        {40,50,60},
                        {70,80,90}};
        
        diagonalSum(matrix);
    }
}
