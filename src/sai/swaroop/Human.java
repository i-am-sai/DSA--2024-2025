package sai.swaroop;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // Independent of the object : Common to all objects

    static void message(){
        System.out.println("Hello People");
      //  System.out.println(this.age); // Can't use this keyword bcoz it is
        // dependent on object but this method is not.
    }
    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }




}
