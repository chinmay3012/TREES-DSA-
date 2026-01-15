import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class stringsearch {
    public static void main(String[] args) {

        String name = "Chinmay";
        char target = 'a';

        System.out.println(search(name,target));

    }

    static boolean search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target== str.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
