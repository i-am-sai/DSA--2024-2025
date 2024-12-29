package Recursion;

public class linearSearch {

    public static int linear(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linear(arr,index+1, target);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,9,6,5};
        int target = 6;
        int result = linear(arr,0,target);
        System.out.println("Index : " + result);
    }
}
