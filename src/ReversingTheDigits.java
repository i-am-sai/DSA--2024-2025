import java.util.Scanner;

public class ReversingTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ReverseDigit(n);
        String str = "Let's Fight";
        ReverseString(str);
    }

    static int ReverseDigit(int n){
        int ans = 0;
        while(n > 0){
            int temp =  n % 10;
            n = n /10;
            ans = ans * 10 + temp;
        }
        System.out.println(ans);
        return ans;
    }

    static String ReverseString(String str){
           char ch;
           String ans = "";
           for(int i =0; i< str.length(); i++){
               ch = str.charAt(i);
               ans =   ch + ans;
           }
        System.out.println(ans);
    return ans;
    }

}
