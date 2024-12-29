public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,9};
        int target = 9;
        System.out.println(BS(arr,target));
    }

    public static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(end >= start){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
