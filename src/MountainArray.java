public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,10,9,8,7,6};
        System.out.println(peakElement(arr));


    }

    public static int peakElement(int[] arr)
    {
        //add code here.
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = (start + end )/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }

        return arr[end];

    }
    }
