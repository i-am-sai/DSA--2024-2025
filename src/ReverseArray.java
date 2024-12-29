import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9};
        int s = 0;
        int e = arr.length-1;

        for(int i=0; i<arr.length; i++) {
            if (s < e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(Arrays.toString(arr));

    }

    static int max(int[] arr){
        int i = 0;
        int e = arr.length-1;
        int m = arr[i];
        for(int k =0; k<=e; k++ ){
            if(arr[k] > m){
                m = arr[k];
            }
        }
        return m;
    }

    static int min(int[] arr){
        int i = 0;
        int e = arr.length-1;
        int m = arr[i];
        for(int k =0; k<=e; k++ ){
            if(arr[k] < m){
                m = arr[k];
            }
        }
        return m;
    }
}
