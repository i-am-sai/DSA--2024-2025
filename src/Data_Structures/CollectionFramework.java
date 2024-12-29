package Data_Structures;

import java.util.*;

public class CollectionFramework {

    static void showcaseCollectionUsage(){
        int[] numArray = new int[]{1,2,3,4};   // array to hold integers

        List<Integer> numberList = new ArrayList<>(); // Array list to hold integer objects

        //Create HashMap to map integer keys to string values
        Map<Integer, String> numberMap = new HashMap<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        numberMap.put(1, "alpha");
        numberMap.put(2, "beta");

        System.out.println("Array : " + numArray[0]);
        System.out.println("ArrayList : " + numberList.get(0));
        System.out.println("HashMap : " + numberMap.get(1));

        System.out.println("Iterating over elements");
        //array
        for(int num: numArray){
            System.out.print(num + " ");
        }
        System.out.println();
        //Arraylist
        for(Integer num : numberList){
            System.out.println(num + " ");
        }
        System.out.println();

        // HashMap
        for(Map.Entry<Integer, String> entry : numberMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value:" + entry.getValue());
        }
    }

    public static void main(String[] args) {
showcaseCollectionUsage();
    }
}
