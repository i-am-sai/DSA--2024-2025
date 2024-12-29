public class Rotatematrix {

    public static void main(String[] args) {
       int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" " +"\t");
            }
            System.out.println();
        }

       rightrotate(matrix,3);


    }

    public static void rightrotate(int[][] matrix, int n) {

       for(int i = 0; i<n;i++){
           for(int j=i; j<n; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
    }

       for(int i=0; i<n; i++){
           int low=0, high =n-1;
           while ((low <high)){
               int temp = matrix[i][low];
               matrix[i][low] =matrix[i][high];
               matrix[i][high] = temp;
               low++;
               high--;
           }
       }


       System.out.println("The Right Rotated Matrix is: ");
//prints matrix after rotation
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" " +"\t");
            }
            System.out.println();
        }
    }
}