public class Arrays {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
        int[] arr = {1,2,3,4,5};

       rotate(arr);

    }

    public static void rotate(int[] arr){
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }
}
