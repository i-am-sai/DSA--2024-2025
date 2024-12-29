import java.util.Arrays;

public class ShiftArray {

    // [1,2,3,4,5] ==> [4,5,3,2,1] : Shift 2 times
    static void shift(int[] arr, int n) {
        int l = arr.length-1;
        for(int j=0; j<n; j++) {
            int temp = arr[l];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr, int s, int e){
        for(int i =s; i<e; i++){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int s = 0;
//        int e = arr.length-1;
//        System.out.println(Arrays.toString(reverse(arr,s,e)));
//        for(int i =1; i<3; i++){
//            int temp = arr[arr.length-1];
//            for(int j = arr.length-1; j>0; j--){
//                arr[j] = arr[j-1];
//            }
//            arr[0] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr ={1,2,3,4,5};
       int n = arr.length;
        int k= 7;
        k = k%n;
        System.out.println(k);
        shift(arr,k);


    }
}
