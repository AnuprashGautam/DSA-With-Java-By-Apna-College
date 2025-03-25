public class ComplexNumbers {
    static String addComplex(int a, int bi, int c, int di)
    {
        int real=a+c;
        int img=bi+di;
        return real+"+"+img+"i";
    }

    static String subComplex(int a, int bi, int c, int di)
    {
        int real=a-c;
        int img=bi-di;
        return real+"+"+img+"i";
    }

    static String mulComplex(int a, int bi, int c, int di)
    {
        // (a + ib) (c + id) = (ac - bd) + i(ad + bc).
        int real=((a*c)-(bi*di));
        int img=((a*di)+(bi*c));
        return real+"+"+img+"i";
    }

    public static void main(String[] args) {
        System.out.println(addComplex(1, 2, 3, 4));
        System.out.println(subComplex(4, 3, 2, 1));
        System.out.println(mulComplex(8, 3, 2, 9));
    }
}
