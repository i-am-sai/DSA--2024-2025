import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public static List<String> findPermuations(int num){

        String numstr = Integer.toString(num);
        List<String> result = new ArrayList<>();
        permute(numstr,0,numstr.length()-1,result);
        return result;

    }

    //Recursive function
    private static void permute(String str, int left, int right, List<String> result){
        if(left == right){
            result.add(str);    // base case
        } else {
            for(int i=left; i<= right; i++){
                str =swap(str, left,i);    // swap characters
                permute(str, left+1, right,result);  // Recurse
                str = swap(str,left,i); // BackTrack to the original string
            }
        }
    }


    private static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        int number = 123;
        List<String> list = findPermuations(number);

        for(String permuate: list){
            System.out.print(permuate + " ");
        }


    }
}
