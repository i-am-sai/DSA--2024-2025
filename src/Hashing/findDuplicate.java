package Hashing;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.HashSet;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,4,5,5,6,7};

        // Find the duplicate elements
        HashSet<Integer> seen = new HashSet<>();

        for(int num : arr){
            if(seen.contains(num)){
                System.out.println("Duplicate: " + num);
            } else {
                seen.add(num);
            }
        }
        System.out.println(seen);

        // HashMap usecase
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(1,4);
        map.put(3,4);
        System.out.println(map.getOrDefault(1,0)+1);

        //Count freq of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        System.out.println(freqMap);
    }
}
