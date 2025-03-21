import java.util.Arrays;

class StringAnagrams {
    static boolean isAnagrams(String str1, String str2)
    {
        // Converted the strings in lowercase so that we don't need to check for the uppercase characters.
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // Checkong the length.
        if(str1.length()==str2.length())
        {
            char[] str1CharArray= str1.toCharArray();
            char[] str2CharArray= str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result= Arrays.equals(str1CharArray, str2CharArray);

            if(result)
            {
                System.out.println("The strings are anagrams.");
            }else{
                System.out.println("The strings are not anagrams.");
            }
        }else{
            System.out.println("The strings are not anagrams.");
        }

        return true;
    }

    public static void main(String[] args) {
        String str1= "SILENT";
        String str2= "listen";

        isAnagrams(str1, str2);
    }
}
