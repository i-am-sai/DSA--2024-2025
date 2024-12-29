public class equalsOverride {
    int num;
    equalsOverride(int num){
        this.num = num ;
    }

    @Override
    public boolean equals(Object obj){
        return this.num == (( equalsOverride)obj).num;  // Casting
    }
    public static void main(String[] args) {
        String a = new String("Abs");
        String b = new String("Abs");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        // The String class in Java overrides the equals() method from the Object class.
        // The overridden equals() method in String compares the contents (characters) of the strings,
        // rather than their memory references.

        equalsOverride c = new  equalsOverride(7);
        equalsOverride d = new  equalsOverride(7);
//        In contrast, your cd class does not override the equals() method, so it inherits the default behavior of equals() from the Object class.
//        The default implementation of equals() in Object checks for reference equality, i.e., whether the two references point to the same object in memory.
//     Solutiuon :    If you want cd.equals(d) to compare the value of the integer a instead of the memory references, you need to override the equals() method in the cd class.

        Integer e = 7;
        Integer f =7;

        System.out.println(c.equals(d));
        System.out.println(c == d);
        System.out.println(e.equals(f));
    }
}
