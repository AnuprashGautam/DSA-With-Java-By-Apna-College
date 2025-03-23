class AddOne {
    static void addOne(int a)
    {
        System.out.println("Before adding: "+a);
        System.out.println("After adding: "+ -(~a));
    }

    public static void main(String[] args) {
        addOne(-11);
    }
}
