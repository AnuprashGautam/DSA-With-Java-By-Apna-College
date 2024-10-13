public class FactorialCode {
    public static int factorial(int a)
    {
        int f=1;
        for (int i = 1; i <= a; i++) {
            f *=i;            
        }
        return f;
    }
    
    public static void main(String[] args) {
        System.out.println("The factorial of 4 is:"+factorial(4));
    }
}
