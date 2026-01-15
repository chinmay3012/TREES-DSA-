import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

//searching for an element in an array and returning its index
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,34,14,56,67,23};
        int target= sc.nextInt();
        int search= search(arr , target);
        System.out.println(search);

    }
    static int search(int[] arr , int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return -1;
            }
            if(arr[i]==target){
                ans=i;
            }
        }
        return ans;
    }
}
