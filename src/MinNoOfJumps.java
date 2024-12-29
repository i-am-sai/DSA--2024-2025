public class MinNoOfJumps {

    public static void main(String[] args) {
      int[] arr = {1,2,1,1,1,1,2};
        System.out.println(MNJ(arr));

    }

    public static int MNJ(int[] arr){
        int i =0;
        int n =0;
        int count = 0;

        while(i < arr.length-1){
            n = arr[i];
            if( arr[i] > 0){
               i += n;
               count++;
            }
        }
        return count;
    }
}

