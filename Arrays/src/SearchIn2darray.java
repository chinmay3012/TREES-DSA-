import java.util.Arrays;

public class SearchIn2darray {
    public static void main(String[] args) {

        //array declaration
        int[][] arr = {
                {1, 2, 3},
                {34, 45, 34, 7},
                {234, 45, 12, 56, 55},
        };
        int target = 55;
        int[] ans = search(arr,target);//stored array in a 1d array
        System.out.println(Arrays.toString(ans));
    }

    //when we have to make return type as array then we use int[] as return type.
    static int[] search(int[][] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {

//                    here the function dont know about the 2d array return as we have'nt declared it in this fucntion .
//                    So created a new object here as return

                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};//if above dont recognise the condition then return false in 2d array.
    }
}
