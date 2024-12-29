package Data_Structures;
import java.util.HashMap;



public class hashmapex {
    public static void main(String[] args) {

        String str = "Hello World";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char ch: str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Charachter Frequencies: " + charCount);
    }
}

