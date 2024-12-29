import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int[][] arr = new int[row][column];

        for(int i =0; i<row; i++){
            for(int j = 0; j<column; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i =0; i<row; i++){
            for(int j =0; j<column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] eachRow: arr){
         for(int element : eachRow ){
             System.out.print(element + " ");
         }
            System.out.println();
        }



//
//        for(int i =0; i<num.length; i++){
//            for(int j = 0; j< num[i].length; j++ ){
//                System.out.print(num[i][j] );
//            }
//        }
//
//        // For Each Loop
//        for(int[] row : num){
//            for(int i : row){
//                System.out.println(i);
//            }
//        }
    }
}
