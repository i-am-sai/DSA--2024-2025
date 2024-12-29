package Strings;

public class Vowels_Constants {

    public static void main(String[] args) {
           String str = "swAroop";
           vow_const(str);
    }

    public static void vow_const(String str) {
        int vowels = 0;
        int constants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                constants++;
            }
        }
        System.out.println("Vowels : " + vowels + " Constatns : " + constants);
    }
    }

