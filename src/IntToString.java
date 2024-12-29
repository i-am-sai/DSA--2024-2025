public class IntToString {
    public static void main(String[] args) {
        String s = "22";
        System.out.println(s);
        int n = Integer.parseInt(s);
        System.out.println(n);
        System.out.println(n+n);
        System.out.println(s+n);

        int i = 98;
        String m = Integer.toString(i);
        System.out.println(m+m);
    }
}
