public class BinomialCoefficient {
    public static int factorial(int a)
    {
        int f=1;
        for (int i = 1; i <= a; i++) {
            f *=i;            
        }
        return f;
    }

    public static float binomialCoefficient(int n, int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_min_r=factorial(n-r);
    
        float binCoe=fact_n/(fact_r*fact_n_min_r);

        return binCoe;
    }

    public static void main(String[] args) {
        System.out.println("10C4 is equal to:"+binomialCoefficient(10, 4));
    }
}
