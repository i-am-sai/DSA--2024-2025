package Hashing;

import java.util.HashMap;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "HelHlo";
        System.out.println(firstNonRepeating(str));
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char ch: str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }
        for(char ch: str.toCharArray()){
            if(charCount.get(ch) == 1){
                System.out.print(ch);
            }
            else{
                System.out.print("_");
            }
        }
    }

    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return '_'; // No non-repeating character
    }

}
