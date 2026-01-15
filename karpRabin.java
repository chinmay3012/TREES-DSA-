import java.util.*;
public class karpRabin {
    private static int PRIME = 101;
    //rolling hash to match
    private static long createHash(String str , int length){
        long hash = 0;
        for(int i =0 ; i<length ; i++){
            hash = (long) (hash + str.charAt(i) * Math.pow(PRIME , i));
        }
        return hash;
    }

    // Update hash when sliding window (remove old char, add new char)
    private static long updateHash(long prevHash , char oldChar , char newChar , int patternLength){
        long newHash = (prevHash - oldChar) / PRIME ;
        newHash = (long) (newHash + newChar*Math.pow(PRIME , patternLength-1)) ;
        return newHash;
    }

    //Karp-Rabin search Algorithm
    public static void search(String text , String pattern ){
        int n = text.length();
        int m = pattern.length();

        long textHash = createHash(text , m);
        long patternHash = createHash(pattern , m);

        for(int i = 0 ; i<=n-m ; i++){
            // If hash matches, confirm with actual substring comparison
            if(patternHash == textHash && text.substring(i , i+m).equals(pattern)){
                System.out.println(i+" "+patternHash);
            }

            // Slide the window: update hash
            if(i < n - m){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + m), m);
            }
        }

    }
    // Driver
    public static void main(String[] args) {
        String text = "abedabeabc";
        String pattern = "abc";

        search(text, pattern);
    }
}
