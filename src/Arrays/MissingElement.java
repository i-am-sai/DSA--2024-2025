package Arrays;
//Input: arr[] = [1, 2, 4, 6, 3, 7, 8] , n = 8
//Output: 5
//Explanation: Here the size of the array is 8,
// so the range will be [1, 8]. The missing number between 1 to 8 is 5


public class MissingElement {
    public static void main(String[] args) {
         int[] arr = {1,2,4,6,3,7,8};
         int n =8;
        System.out.println(missEl(arr,n));
    }

    static int missEl(int[] arr, int n){
        int originalSum = n*(n+1)/2;
        int C_sum =0;
        int m = arr.length;

        for(int i=0; i<m; i++){
            C_sum += arr[i];
        }

        int misss_el = originalSum - C_sum;
        return misss_el;

    }
}
