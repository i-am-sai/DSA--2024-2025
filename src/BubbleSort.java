import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr= {1,3,5,4,2};
        BS(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void BS(int[] arr){

        for(int i =0; i< arr.length; i++){
            for(int j=1; j< arr.length-i; j++) { // for(int j =0; j<arr.length-i-1; j++);
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }


}
