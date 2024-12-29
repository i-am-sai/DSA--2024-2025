package Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
    String st1 = "Hello";
    String st2 = "eeHlo";
        System.out.println(Check(st1,st2));

        System.out.println(st1.toCharArray());
    }
    public static Boolean Check(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        return Arrays.equals(st1, st2);

    }
}
