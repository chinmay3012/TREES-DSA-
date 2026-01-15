
//https://leetcode.com/problems/missing-number/

import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};

        missing(arr);
        System.out.println(Arrays.toString(arr));

    }


    static int missing(int[] arr){

        //sorting the array through cyclic sort
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr , i , correct);

            }else{
                i++;
            }
        }

        //searching the missing element
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index){
                return index;
            }

        }
        return arr.length;
    }

    //creating swap function
    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
