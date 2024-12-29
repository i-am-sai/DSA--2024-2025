package sai.swaroop;

// Initialization of static variables
public class StaticBlock {

    static int a =6;
    static int b;
    // Will only run once, when the first obj is created i.e when the class is loaded for the first time.
    static {
        System.out.println("I'm in a static block");
        b = a +5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
