import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4};
        System.out.println(Duplicate(arr));
        System.out.println("Enter nth number : "); // 0,1,1,2,3,5,8,13.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count  = 2;
        while(count <= n){
            int temp = b;
             b = b + a;
             a = temp;
             count++;
        }
        System.out.println(b);
    }

    public static int Duplicate(int[] arr){
        int ans = 0;
        for(int i =0; i<arr.length-1; i++){
            for(int j = 1; j< arr.length; j++){
                if(arr[i] == arr[j] && i!=j ){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
}
