import java.util.*;
public class swapping {
    public static void main(String[] args) {
        int[] arr={4,3};
        swap(arr,0,1);  // here 0 & 1 are index of arr .
        System.out.println(Arrays.toString(arr));
    }
   public static void swap(int[] arr, int a, int b) {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
}
