package Arrays;
import java.util.HashMap;

public class XOR {
    public static int countSubarraysWithXOR(int[] nums, int target) {
        // HashMap to store the frequency of prefix XORs
        HashMap<Integer, Integer> prefixXORMap = new HashMap<>();
        int count = 0; // To store the count of subarrays
        int prefixXOR = 0; // Initialize prefix XOR as 0

        for (int num : nums) {
            // Update the prefix XOR
            prefixXOR ^= num;

            // If the current prefix XOR equals the target, we found a subarray
            if (prefixXOR == target) {
                count++;
            }

            // Check if there exists a prefix XOR such that:
            // prefixXOR[j-1] = prefixXOR[i] ⊕ target
            int requiredXOR = prefixXOR ^ target;
            if (prefixXORMap.containsKey(requiredXOR)) {
                count += prefixXORMap.get(requiredXOR);
            }

            // Update the frequency of the current prefix XOR in the map
            prefixXORMap.put(prefixXOR, prefixXORMap.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {4, 2, 2, 6, 4};
        int target1 = 6;
        System.out.println("Count of subarrays: " + countSubarraysWithXOR(nums1, target1)); // Output: 4

        // Test case 2
        int[] nums2 = {5, 6, 7, 8, 9};
        int target2 = 5;
        System.out.println("Count of subarrays: " + countSubarraysWithXOR(nums2, target2)); // Output: 2

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        int target3 = 10;
        System.out.println("Count of subarrays: " + countSubarraysWithXOR(nums3, target3)); // Output: 0
    }
}
