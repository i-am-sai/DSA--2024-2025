import java.util.Arrays;
public class Sort012 {
    public static void main(String[] args) {
   int[] arr= {1,2,0,0,2,1,2};
  sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Dutch National Flag Algorithm
    public static void sort012(int[] arr){
        int n = arr.length;
        int lo =0;
        int mid=0;
        int hi = n-1;
        int temp =0;

        while (mid <= hi){
            if(arr[mid] ==0){
                swap(arr,mid, lo);
                lo++;
                mid++;
            } else if (arr[mid] ==1) {
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
