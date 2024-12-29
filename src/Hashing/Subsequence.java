package Hashing;

import java.util.HashSet;

public class Subsequence {
    public static void main(String[] args) {
        String str = "MynnameeeSai";
        System.out.println(longestUniqueSubstring(str));
    }

    // Find the longest substring without repeating characters
    public static int longestUniqueSubstring(String str){
        HashSet<Character> set = new HashSet<>();
        int maxLength =0, left =0;
        for(int right =0; right <str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right-left +1);
        }
        return maxLength;
    }
}
