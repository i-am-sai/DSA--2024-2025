package sai.swaroop.Interface.extend;

public class Main implements B {  // implements A,B

    @Override
    public void greet() {
    }


    public static void main(String[] args) {
        Main obj = new Main();
       A.greeting();
    }
}