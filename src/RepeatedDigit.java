import java.util.Scanner;

public class RepeatedDigit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,4,4,8,5,1,1};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Digit which you need to count : ");
        int target = input.nextInt();
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The digit is repeated for " + count + " times");
        RepeatedDigitInNumber();
    }

    public static void RepeatedDigitInNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Enter a target digit : ");
        int target = in.nextInt();
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem==target){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
