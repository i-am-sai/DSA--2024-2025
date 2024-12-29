package sai.swaroop.sample1;

import sai.swaroop.access.A;

public class demo1 extends A{

    public demo1(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
         demo1 obj = new demo1(45,"sai");
        System.out.println(obj instanceof demo1);
        System.out.println(obj.getClass().getName().toUpperCase());

    }
    public static void greetings(){
        System.out.println("This is information from demo1 of sample 1 to demo1 of sample 2");
    }
}
