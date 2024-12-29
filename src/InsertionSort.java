import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      int[] arr = {9,4,2,3,7,5,1};
      IS(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void IS(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static  void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}