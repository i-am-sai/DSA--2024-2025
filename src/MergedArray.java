import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
      int[] arr1 = {1,4,2,2,6,7};
      int[] arr2 = {8,9,2,6};
      int i = 6;
      int j = 4;
      MergeSort(arr1,arr2,i,j);
      merge(arr1,arr2);
    }

    public static int[] MergeSort(int[] arr1, int[] arr2, int m, int n){

        int[] mergedArray = new int[m+n];
        int i = 0, j = 0, k =0;

        while( i< m && j<n){
            if(arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }
            else{
                mergedArray[k++] = arr2[j++];
            }
        }

        while(i < m){
            mergedArray[k++] = arr1[i++];
        }

        while (j<n){
            mergedArray[k++] = arr2[j++];
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;
    }

    public static void merge(int[] arr1, int[] arr2){
        int l = arr1.length + arr2.length;
        int[] arr3 = new int[l];
        int k =0;
        for(int i =0; i<arr1.length; i++){
            arr3[k] = arr1[i];
            k++;
        }
        for(int j=0; j<arr2.length; j++){
            arr3[k] = arr2[j];
            k++;
        }
        System.out.println(Arrays.toString(arr3));

    }
}
