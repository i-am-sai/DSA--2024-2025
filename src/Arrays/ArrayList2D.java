package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());  // Add new 3 row (Arraylist)
        }

        // Step 3: Adding elements to each row
        list.get(0).add(1); // Add 1 to the first row
        list.get(0).add(2); // Add 2 to the first row
        list.get(1).add(3); // Add 3 to the second row
        list.get(2).add(4); // Add 4 to the third row
        list.get(2).add(5); // Add 5 to the third row

        System.out.println("2D ArrayList: " + list);
        System.out.println("Element at (0, 1): " + list.get(0).get(1));

    }
}
