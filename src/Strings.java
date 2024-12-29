import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name = "Fight";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));     // String into Array of Characters.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.toUpperCase().charAt(1));       // Individual character
        System.out.println(Arrays.toString(name.split("g")));
        System.out.println("               Ssiaaaa ");
        System.out.println("         ddddd. " .strip());       // Avoid blank spaces

//        Scanner in = new Scanner(System.in);
//        String A = in.next();
//        String B = in.next();
//        System.out.println(A.length() + B.length());
//        int i = A.compareTo(B);
//        int j = B.compareTo(A);
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(A.substring(0,2).toUpperCase() + A.substring(2) + " " + B.substring(0,2).toUpperCase() + B.substring(1));

        // Pretty Printing
        float a = 48695.4521f;
        System.out.println(a);
        System.out.printf("%.2f", a );
        System.out.println( "\n" +" " + Math.PI);

        // Operators
        System.out.println('a' + 'b'); //ASCII Values
        System.out.println(("A" + "B")); //concatenate 2 strings
        System.out.println((char)('a' + 3)); //TypeCasting
        System.out.println(("a" + 1));
        String series ="";
        for(int i =0; i<26; i++){
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            series += ch;
        }
        System.out.println(series);
    }

}
