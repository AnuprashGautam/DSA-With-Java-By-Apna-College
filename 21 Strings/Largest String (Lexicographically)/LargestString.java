class LargestString {
    static String largeString(String[] stringArray)
    {
        String lString= stringArray[0];

        for (int i = 1; i < stringArray.length; i++) {
            if(lString.compareToIgnoreCase(stringArray[i])<0)
            {
                lString= stringArray[i];
            }
        }

        return lString;
    }

    public static void main(String[] args) {
        String[] stringArray={"apple", "mango", "pineapple", "banana"};

        System.out.println("Largest string is: "+largeString(stringArray));
    }
}
    