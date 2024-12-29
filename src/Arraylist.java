import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(6);
        System.out.println(list.size());
        list.set(1,4);
        System.out.println(list);
        for(int n: list){
            System.out.print(n + " ");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted List " + list);

        // Strings
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("My");
        list1.add("Name");
        list1.add("Sai");
        list1.add("Swaroop");
        System.out.println(list1);
        list1.add(2,"is");
        for(String str: list1){
            System.out.print(str + " ");
        }
        System.out.println("\n" + list1.indexOf( "Sai"));
        System.out.println(list1.get(1));
        Collections.sort(list1);
        for(String str: list1){
            System.out.print(str + " ");
        }

        // Reverse the order : sort the list of sterings alphabetically in reverse/ descending order

        Collections.sort(list1, Collections.reverseOrder());

        for(String value: list1){
            System.out.print(value + " ");
        }



    }
}