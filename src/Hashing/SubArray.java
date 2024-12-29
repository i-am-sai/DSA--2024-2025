package Hashing;
import java.util.HashSet;
import java.util.HashMap;


public class SubArray {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5};
        System.out.println(hasZeroSumSubArray(arr));
        int[] array = {10, 2, -2, -20, 10};
        int targetSum = -10;

        findSubArrayWithSum(array, targetSum);
    }

    public static void findSubArrayWithSum(int[] array, int targetSum) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            // Check if the current sum equals the target sum
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            // Check if (currentSum - targetSum) exists in the map
            if (prefixSumMap.containsKey(currentSum - targetSum)) {
                System.out.println("Subarray found from index " + (prefixSumMap.get(currentSum - targetSum) + 1) + " to " + i);
                return;
            }

            // Add currentSum to the map
            prefixSumMap.put(currentSum, i);
        }

        System.out.println("No subarray with the given sum found.");
    }
    public static boolean hasZeroSumSubArray(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int sum =90;
        for(int num: nums){
            if(set.contains(sum) || sum ==0){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
