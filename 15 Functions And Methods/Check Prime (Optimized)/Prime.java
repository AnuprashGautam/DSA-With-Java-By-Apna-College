public class Prime {
    public static boolean checkPrime(int a)
    {
        if(a==2)
            return true;
        
        for (int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(20));
    }
}
