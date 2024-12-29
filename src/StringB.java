
public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // Object created , These string are mutable.
        builder = builder.append('a');
        builder = builder.append('b');
        System.out.println(builder);

        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }
}
