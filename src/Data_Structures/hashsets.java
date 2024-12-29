package Data_Structures;
import java.util.HashSet;

public class hashsets {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,5};
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int num: arr){
            uniqueNums.add(num);
        }

        System.out.println("Unique Numbers : " + uniqueNums);
    }
}
