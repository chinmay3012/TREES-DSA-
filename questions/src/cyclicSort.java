import java.util.*;
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println(Arrays.toString(arr));

        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i ,correct);
            }
            else{
                i++;
            }
        }
    }

    //creating swap function
    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
