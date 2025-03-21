class OddEven {
    static boolean isEven (int n)
    {
        int maskBit=1;

        if((n & maskBit)==0)
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is 4 a even number: "+isEven(4));
        System.out.println("Is 10 a even number: "+isEven(10));
        System.out.println("Is 13 a even number: "+isEven(13));
    }
}
