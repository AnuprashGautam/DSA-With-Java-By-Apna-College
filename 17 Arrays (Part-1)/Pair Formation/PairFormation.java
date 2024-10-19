public class PairFormation {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70},tp=0;

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++,tp++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        System.out.println("The total number of pairs are:"+tp);
    }
}
