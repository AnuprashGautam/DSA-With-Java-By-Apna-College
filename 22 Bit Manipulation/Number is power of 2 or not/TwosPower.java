class TwosPower {
    static boolean isTwosPower(int num)
    {
        if( (num & num-1) ==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Is number 24 in 2's power: "+ isTwosPower(24));
        System.out.println("Is number 8 in 2's power: "+ isTwosPower(8));
    }
}
