package Arrays;

public class SlidingWindowSubArraySum {
    public static void main(String[] args) {
       int[] arr = {1,2,20,4,5,8,9,2,3,30};
       int k = 3;
        SlidingWindow(arr,k);
        BruteForce(arr,k);
    }

    public static int SlidingWindow(int[] arr, int k){
        int C_sum =0, O_sum =0;
        for(int i=0; i<k;i++){
            C_sum += arr[i];
        }
        for(int i=k; i< arr.length; i++){
            C_sum = C_sum + arr[i] - arr[i-k];
            if(C_sum > O_sum){
                O_sum = C_sum;
            }
        }
        System.out.println(O_sum);
        return O_sum;
    }

    public static int BruteForce(int[] arr, int k){
        int O_result =0;
        int s =0;
        int e= 0;
        int j;
        int i;
        for(i=0; i<arr.length-k+1; i++){
            int c_result =0;
            for(j=0; j<k; j++){
                c_result += arr[j+i];// j+i : keeps shifting 1 after every inner loop iteration
            }
            if(c_result > O_result){
                O_result = c_result;
                s = i;
                e = j+i-1;
            }

        }
        System.out.println(" result : " + O_result + " Indexes : " + s + " "+ e );
        return O_result;
    }
}
