package Data_Structures;


import java.util.Arrays;
import java.util.ArrayList;

public class Array {

    public Array(){}

    public String[] getTopics(){
        String[] topics = {"Dog","Cat","Whale"};
        return topics;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,8,2,5,6};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString( RemoveElement(arr, 2)));
        int[] arr1 = {1,2,3,5,3,7};
        System.out.println(findDuplicate(arr1));

        String s = "{Mp:saf[dfds}]";
        ArrayList<String> ar = new ArrayList<>();
        System.out.println(ar);

        Array Animals = new Array();
        System.out.println(Arrays.toString(Animals.getTopics()));
    }

    public static int[] Sorting(int[] arr){
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] RemoveElement(int[] arr, int index){
        int[] arr1 = new int[arr.length-1];
        for(int i =0, k=0; i < arr.length; i++){
            if(i == index){
                continue;
            }
            arr1[k++] = arr[i];
        }
        return arr1;
    }

    public static int findDuplicate(int[] nums) {

        int ans = nums[0];

        for(int i =0; i<nums.length-1; i++){
            for(int j =1; j<nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    ans = nums[i];
                    return ans;
                }

            }
        }
        return ans;
    }
}
