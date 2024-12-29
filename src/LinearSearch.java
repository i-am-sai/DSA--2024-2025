public class LinearSearch {
    public static void main(String[] args) {
          int[] arr = {1,4,7,2,9};
          int target = 8;
        System.out.println(LL(arr,target));
    }

    public static int LL(int[] arr, int target){
        int ans = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i] == target){
                ans = i;
                return ans;
            }
        }
        return -1;
    }
}
