import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println(" Enter the two values operand1 and operand2");
        int a = in.nextInt();
        int b = in.nextInt();
        int result;
        System.out.println("Choose the operator");
        char ch = in.next().trim().charAt(0);
        switch (ch){
            case '+':
                result = a + b;
                System.out.println("Sum : " + result);
                break;
            case '-':
                result = a-b;
                System.out.println("Difference : " + result);
                break;
            case '*':
                result = a*b;
                System.out.println("Product : " + result);
                break;
            case '/':
                result = a/b;
                System.out.println("Quotient : " + result);
                break;
            case '%':
                result = a%b;
                System.out.println("Reminder : " + result);
                break;
            default:
                System.out.println("INVALID");
        }
    }
}
