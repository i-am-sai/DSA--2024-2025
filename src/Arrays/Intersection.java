package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,1,7};
        int[] arr2 = {6,5,1,3};
        Intersection(arr1,arr2);

    }

    public static int[] Intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // adding arr1 elements to set
        for(int num: arr1){
            set.add(num);
        }

        // Check common elements and add the result to result map.
        for(int num: arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        // converting map to array
        int[] intersection = new int[result.size()];
        int i=0;
        for(int num: result){
            intersection[i++] = num;
        }

        System.out.println(Arrays.toString(intersection));
        return intersection;

    }


}
