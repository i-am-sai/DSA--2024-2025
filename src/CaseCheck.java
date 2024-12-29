import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        char c = (char) 65;  // Type Casting that converts integer 65 into A (unicode value).
        System.out.println(c);
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("UPPERCASE");
        }

        System.out.println("UPPERCASE LETTERS : ");
        for(int i = 65; i<=90; i++){
            System.out.print((char) i + " ");
        }

        System.out.println("\nlowercase letters");
        for(int i = 97; i<=122; i++){
            System.out.print((char) i + " ");
        }

        int m = 600;
        int s = 550;
        float f = (float) s/m*100.0f;
        System.out.println(f);

    }
}
