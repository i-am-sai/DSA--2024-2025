package Recursion;

public class sum {
    static int add(int n){
        int sum =0;
       for(int i= 0; i<=n; i++){
           sum += i;
       }
       return sum;
    }

    static int sum(int n){
        if(n == 0){ //  Base case : if n is less than 1, stop recursion
            return 0;
        }
        return n + sum(n-1);
    }

    static void print(int n){
        if(n <1){  // Base Case : If n is less than 1, stop recursion
           return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        int n = 10; // Change this value to print different ranges
        System.out.println("Printing the first " + n + " numbers:");
        print(n);
        System.out.println("\nSum : " + add(n));

        System.out.println("Sum of first n numbers is : " + sum(n));
    }
}
