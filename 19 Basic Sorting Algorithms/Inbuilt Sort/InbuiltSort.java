import java.util.Arrays;
import java.util.Collections;

class InbuiltSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,0,5,4};
        Integer[] arr1={1,3,2,0,5,4};

        // Sorting the portion of array in increasing order.
        Arrays.sort(arr,0,3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\n-------------------------");

        // Sorting whole array in increasing order.
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\n-------------------------");

        // Sorting the portion of array in decreasing order.
        Arrays.sort(arr1,0,3, Collections.reverseOrder());
        for (Integer i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println("\n-------------------------");

        // Sorting whole array in decreasing order.
        Arrays.sort(arr1, Collections.reverseOrder());
        for (Integer i : arr1) {
            System.out.print(i+" ");
        }
        
    }
}
