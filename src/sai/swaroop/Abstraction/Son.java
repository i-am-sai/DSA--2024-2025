package sai.swaroop.Abstraction;

public class Son extends Parent {

    public Son(int age){
        super(age);
        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I'm going to be Money Machine");
    }

    @Override
    void partner() {
        System.out.println("I love Money" );
    }

}
