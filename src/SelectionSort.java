import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr = { 9,2,5,7,1,4};
       SS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SS(int[] arr){
        for(int i =0; i<arr.length; i++){
            int last = arr.length - i -1;
            int maxIndex = max(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int max(int[] arr, int s, int e){
        int m = s;
        for(int i =0; i <= e; i++){
            if(arr[i] > arr[m]){
                m = i;
            }
        }
    return m;
    }
}
