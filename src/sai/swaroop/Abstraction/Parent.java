package sai.swaroop.Abstraction;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age =age;
    }
//    abstract Parent(); : No abstract constructor

    static void hello(){   // Normal static method in abstract class
        System.out.println("Greetings");
    }

    void normal() {
        System.out.println(" This is a normal method ");
    }

    abstract void career();
    abstract void partner();
}


