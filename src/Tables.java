public class Tables {
    public static void main(String[] args) {
        int outerCounter = 0;
        int[] arr1 = {1,2,3,4,5};
        while(outerCounter < 7){
            System.out.println();
            for(int element : arr1){
                System.out.print(element*outerCounter + " ");
            }
            outerCounter++;
        }
    }
}
