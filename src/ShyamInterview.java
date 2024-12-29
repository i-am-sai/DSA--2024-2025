import java.util.HashMap;

public class ShyamInterview {

    // Find numbber of times each number is there in a array : 1 : 2 times, 6 : 3 times

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,6,7,7,7,8,9,9};
        HashMap<Integer, Integer> charCount = new HashMap<>();
        for(int i: arr){
            charCount.put(i, charCount.getOrDefault(i, 0) + 1);
        }
        System.out.println("Charachter Frequencies: " + charCount);
    }
}
