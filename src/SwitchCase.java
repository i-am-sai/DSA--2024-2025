import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Operation");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int a =10;
        int b=5;
        switch(ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            default:
                System.out.println("Error");
        }
    }
}
