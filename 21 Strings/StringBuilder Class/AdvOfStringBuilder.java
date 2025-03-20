class AdvOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");

        for(char ch='a'; ch <= 'z'; ch++)
        {
            sb.append(ch);
            // sb = sb + ch;           // The operator + is undefined for the argument type(s) StringBuilder
        }

        System.out.println("StringBuilder object is: ");
        System.out.println(sb);

        System.out.println("The length of the sb is: "+sb.length());
    }
}
