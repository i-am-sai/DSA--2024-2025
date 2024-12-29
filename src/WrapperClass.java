public class WrapperClass {
    public static void main(String[] args) {
        int a =7;
        int b = 20;
        Integer num  = 60; // Wrapper class : object creation
        // A Wrapper class in Java is a class whose object wraps or contains primitive data types.
        // On object data we can call multiple methods compareTo(), equals(), toString()
        swap(a,b);
        System.out.println(a + " " + b);
        changePrimitive(b);
        System.out.println(b);
    }

    // Java is pass by value
     static void swap(int a, int b){ // these a and b are inside this scope itself
        int temp = a;
        a =b;
        b = temp;
     }

     public static void changePrimitive(int num){
        num  =10;
     }
}
