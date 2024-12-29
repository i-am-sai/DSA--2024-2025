import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PermutationsPrimeCheck {


    public static void main(String[] args) {
        int num = 123;
        List<String> list = permutations(num);

        for(String str: list){
            System.out.print(str + " ");
        }

        List<Integer> list1 = new ArrayList<>();
        for(String str : list){
            list1.add(Integer.parseInt(str));
        }

        System.out.println();
        List<Integer> prime = checkPrime(list1);
        for(int n: prime){
            System.out.print(n+ " ");
        }

    }

    public static List<Integer> checkPrime(List<Integer> list){
        int count =0;
        List<Integer> result = new ArrayList<>();
        int n= list.size();
        for(int i=0; i<n; i++){
            int num = list.get(i);
            int m = num/2;
            if(num <= 1){
                break;
            }
            else {
                for(int j=2; j<m; j++){
                    if(num % j ==0){
                        break;
                    }
                    result.add(num);
                    count++;
                }
            }
        }
        return result;
    }


    public static List<String> permutations(int number){
        String numStr = Integer.toString(number);
        List<String> result = new ArrayList<>();
        permute(numStr, 0, numStr.length()-1,result);
        return result;
    }

    private static void permute(String str, int left, int right,List<String> result){
        if(left == right){
            result.add(str);
        }
        else {
            for(int i=left; i<=right; i++){
                str =swap(str,left,i);
                permute(str,left+1,right,result);
                str=swap(str,left,i);
            }
        }
    }

    //helper
    public static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char Temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = Temp;
        return String.valueOf(charArray);
    }

}