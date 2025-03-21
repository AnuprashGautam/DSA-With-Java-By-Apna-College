class StringCompression {
    static StringBuilder compressString(String str)
    {
        StringBuilder sb=new StringBuilder();
        Integer count=1;

        char previous=str.charAt(0);
        char current;

        for (int i = 1; i < str.length(); i++) {
            current=str.charAt(i);

            if((i==str.length()-1)&&(previous==current))
            {
                sb.append(current);
                sb.append(count+1);
            }else if(previous==current)
            {
                previous=current;
                count++;
            }else if(previous!=current)
            {
                sb.append(previous);
                sb.append(count);
                previous=current;
                count=1;
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String str="aaaabbbb";

        System.out.println("After compression: "+compressString(str));

        System.out.println("ApnaCollege".replace("l",""));
        str.contentEquals()

    }
}
