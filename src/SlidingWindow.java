class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        BruteForce(arr,k);
   }

   public static int BruteForce(int[] arr, int k){
       int M_Sum =0;
       for(int i =0; i<arr.length-k+1; i++) {   // arr.length-k+1 : Sliding window formula
           int C_Sum =0;
           for(int j = 0; j<k; j++){
               C_Sum += arr[j+i];
           }
           if(C_Sum > M_Sum){
               M_Sum = C_Sum;
           }
       }
       System.out.println(M_Sum);
    return M_Sum;
   }
}