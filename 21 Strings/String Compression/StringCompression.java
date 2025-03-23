class StringCompression {
    static StringBuilder compressString(String str)
    {
        StringBuilder sb=new StringBuilder();
        Integer count=1;

        if(str.length()==1)         // Edge case: when there is only one character in the string.
        {
            sb.append(str.charAt(0));
            sb.append(1);
            
            return sb;
        }

        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()-1)
            {
                if(str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                }
                else{
                    sb.append(str.charAt(i));
                    sb.append(count);
                    count=1;
                }
            }
            else    // i = str.length()-1  Handling the last left character.
            {
                if(str.charAt(i-1)==str.charAt(i))
                {
                    sb.append(str.charAt(i));
                    sb.append(count);
                }
                else{
                    sb.append(str.charAt(i));
                    sb.append(1);
                }
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String str="bbbddddd";

        System.out.println("After compression: "+compressString(str));
    }
}
