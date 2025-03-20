class ShortestPath {
    static double calculateShortestPath(String directionString)
    {
        int x=0, y=0;       // Initial coordinates

        for (int i=0; i < directionString.length(); i++) {
            char ch=directionString.charAt(i);

            if(ch=='N')
                y++;
            else if(ch=='E')
                x++;
            else if(ch=='S')
                y--;
            else        // West 
                x--;
        }

        // Calculating the displacement using the Euclidian formula.
        double x2=Math.pow(x, 2);
        double y2=Math.pow(y, 2);

        double displacement=Math.sqrt(x2+y2);

        return displacement;
    }

    public static void main(String[] args) {
        String directionString="NNEESS";

        System.out.println("The displacement of the person form the initial position is:"+calculateShortestPath(directionString));
    }

}
