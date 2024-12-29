import java.util.Scanner;

// Fibonacci series : 0,1,1,2,3,5,8,13;

public class Fibonacci {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println(" Enter the nth number : ");
        int n= input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
