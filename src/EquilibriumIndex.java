public class EquilibriumIndex {

    public static int index(int[] arr){
        int n= arr.length;

        for(int i =1; i<n-1; i++){
            int left =0;
            int right =0;
           for (int j =0; j<i; j++){
               left += arr[j];
           }
           for(int j =i+1; j<n; j++){
               right += arr[j];
           }

           if(left != 0 && right != 0 && left == right){
               return i;
           }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,7,3,6,5,6};
        System.out.println(index(arr));
    }
}
