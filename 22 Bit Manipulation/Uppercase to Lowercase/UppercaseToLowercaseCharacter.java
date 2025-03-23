class UppercaseToLowercaseCharacter {
    static void upperCaseToLowercaseCharacter()
    {
        for(char ch='A'; ch<='Z'; ch++)
            System.out.print((char)(ch | ' ')+" ");
    }

    public static void main(String[] args) {
        upperCaseToLowercaseCharacter();
    }
}
