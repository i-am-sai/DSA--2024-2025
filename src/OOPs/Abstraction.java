package OOPs;

abstract class Parent{
    int age;
   public Parent(int age){
        this.age =age;
    }

    static void hello(){                          // static method
        System.out.println("Greetings");
    }
    void normal(){                               // normal method
        System.out.println("This is a normal method");
    }

    abstract void carrer();                      //  abstract method
    abstract void partner();
}

class Daughter extends Parent{

    public Daughter(int age){
        super(age);
        this.age = age;
    }

    @Override
    void carrer() {
        System.out.println("Im going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I have not taught of that yet!");
    }

    static void greet(){
        System.out.println("Hello Dad and Mom!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Daughter daughter = new Daughter(16);
        daughter.greet();   // Allowed but not prefered.
        Daughter.greet();   // static methods should be called using class name
     daughter.carrer();
     daughter.partner();
     daughter.normal();


    }
}
