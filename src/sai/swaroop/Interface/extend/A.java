package sai.swaroop.Interface.extend;

public interface A {
    default void fun(){
        System.out.println("Default methods can be implemented without overriding");
    }

    // static interface methods should always have body
    // Call this via the interface name bcoz we it is not dependent on object
    static void greeting() {
        System.out.println("Hey, I'm static method  ");
    }
}
