class SubString {
    static String subStr(String str, int si, int ei)
    {
        String subStr="";

        for(int i=si; i<ei; i++)
        {
            subStr+=str.charAt(i);
        }

        return subStr;
    }

    public static void main(String[] args) {
        String myName= "Anuprash Gautam";

        System.out.println("The substring with starting index 4 and ending index 12 is: "+ subStr(myName, 4, 12));
    }
}
