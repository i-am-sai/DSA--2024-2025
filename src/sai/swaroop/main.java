package sai.swaroop;

public class main {
    public static void main(String[] args) {
        Human Sai = new Human(22, "Sai Swaroop", 50000, false);
        Human Dol = new Human(25, "Dolmaik", 100000, true);
        System.out.println(Human.population);
        greetings();
        main obj = new main();
        obj.fun();
    }

    // This is not dependent on objects
    static void greetings(){
        System.out.println("Static things");
        main obj = new main();
        obj.fun();
        //fun(); // We can't use it because it requires an instance but the
        // function we are using it in does not depend on instance or object.
    }
    // This is dependent on objects or instance
    void fun(){
        System.out.println("Fun things");
    }
}
