package Strings;

public class RotationStringCheck {
    public static void main(String[] args) {
    String str1 = "waterbottle";
    String str2 = "erbootlewat";
        System.out.println(check(str1, str2));
    }
    // Check if a 2nd string is rotation of the 1st;
    static Boolean check(String str1, String str2){

        if(str1.length() != str2.length() || str1.isEmpty()){
            return false;
        }
        String str3 = str1 + str2;
        return  str3.contains(str2);
    }
}
