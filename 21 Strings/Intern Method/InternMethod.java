class InternMethod {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3=new String("hello").intern();
        String str4=str2.intern();
        String str5=str1.intern();


        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str4==str1);
        System.out.println(str5==str1);
    }
}
