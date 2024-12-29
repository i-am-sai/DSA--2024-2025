import java.util.Arrays;

public class FizzArray {

    public static int[] fizzArray(int num){
        int[] arr = new int[num];
        int j =0;
        for(int i=num-1; i>=0; i--){
            arr[j] = i;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
      int[] arr = fizzArray(4);
        System.out.println(Arrays.toString(arr));

    }
}
