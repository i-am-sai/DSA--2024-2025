package sai.swaroop.Abstraction;

public class Daughter extends Parent{


    public Daughter(int age){
        super(age);
        this.age =age;
    }

    void Greetings(){

    }
    @Override
    void career() {
        System.out.println("I'm going to be Dancer");
    }

    @Override
    void partner() {
        System.out.println("I love Gold");
    }
}
