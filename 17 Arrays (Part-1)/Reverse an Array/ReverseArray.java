public class ReverseArray {
    static int[] reverseArray(int[] orgArray) {
        int start = 0, end = orgArray.length - 1;
        while (start < end) {
            int temp = orgArray[start];
            orgArray[start] = orgArray[end];
            orgArray[end] = temp;
            start++;
            end--;
        }
        return orgArray;
    }
    
    public static void main(String[] args) {
        int[] orgArray={10,20,30,40,50};
        System.out.println("The reverse array is:");
        for(int x: reverseArray(orgArray))
        {
            System.out.print(x+" ");
        }
    }
}
