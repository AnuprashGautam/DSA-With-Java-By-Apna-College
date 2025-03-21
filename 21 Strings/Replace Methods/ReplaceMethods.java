class ReplaceMethods {
    public static void main(String[] args) {
        String orgString="Anuprash Gautam Anupbhav Gautam Anurag Gautam";

        System.out.println(orgString.replace('A','a'));
        System.out.println(orgString.replace("Gautam","Sharma"));
        System.out.println(orgString.replaceAll("Anu*","Rakesh"));
        System.out.println(orgString.replaceFirst("Gautam","Sharma"));
        
    }
}
