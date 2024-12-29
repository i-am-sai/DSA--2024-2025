import java.util.Arrays;

public class MaxFrequencyNumber {
    public static void main(String[] args) {
   int[] arr = {5,1,2,3,1,2,1,2,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(MFN(arr));
    }

    public static int MFN(int[] arr){
        int result = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count1++;
                }
            }
            if(count2 < count1){
                count2 = count1;
                result = arr[i];
            }
            count1 = 0;

        }
        System.out.println(count2);
    return result;
    }
}
