import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = Math.max(c, Math.max(a,b));
//        System.out.println(max);

//        if(a>b && a>c){
//            System.out.println(a + "A is the largest");
//        }
//        else if(b>c && b>a){
//            System.out.println(b + "B is the largest");
//        }
//        else{
//            System.out.println(c + "C is the largest");
//        }

        int max = a;
        if(b > max){
            max = b;

        }
        if(c > max){
            max = c;

        }
        System.out.println(max);
    }
}
