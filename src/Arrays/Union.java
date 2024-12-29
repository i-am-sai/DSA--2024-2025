package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,1,7};
        int[] arr2 = {6,5,1,3};
        union(arr1,arr2);
    }

    public static void union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr1){
            set.add(num);
        }

        for(int num: arr2){
            set.add(num);
        }

        int[] union = new int[set.size()];
        int i=0;
        for(int num: set){
            union[i++] =num;
        }
        System.out.println(Arrays.toString(union));
    }
}
