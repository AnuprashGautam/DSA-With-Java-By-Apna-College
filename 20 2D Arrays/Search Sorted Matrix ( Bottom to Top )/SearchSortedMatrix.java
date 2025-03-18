class SearchSortedMatrix {
    static String searchSortedMatrix(int[][] matrix, int key)
    {
        int r=matrix.length-1;
        int c=0;


        while(c<matrix.length & r>=0)
        {
            if(matrix[r][c]==key)       // Starting point. Bottome Left Corner element
            {
                return "Found at row: "+(r+1)+" and column: "+(c+1);
            }
            else if(matrix[r][c] < key)
            {
                // Move Right Side
                c++;
            }
            else if(matrix[r][c] > key)
            {
                // Move Top side
                r--;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
                    
        System.out.println(searchSortedMatrix(matrix, 29));
    }
}
