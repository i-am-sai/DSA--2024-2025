public class EvenOdd{
public static void main(String[] args) {
    String str1 = "Sai";
    int[] arr = {1, 2, 3, 4, 5, 6, 8};
    System.out.println(even(arr));
    System.out.println(odd(arr));
    System.out.println(EvenCheck(77));
    System.out.println(digits(1893));
    int a = 15;
    float b = a/10;
    int c = a%10;
    System.out.println(b);
    System.out.println(c);
}

public static int even(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            count++;
        }
    }
    return count;
}


public static int odd(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
            count++;
        }
    }
    return count;
}

static boolean EvenCheck(int num){
    if(num % 2 == 0){
      return true;
         }
    return false;
      }

    static int digits(int num){

        if(num < 0){
            num = num -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
