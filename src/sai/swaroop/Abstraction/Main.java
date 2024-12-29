package sai.swaroop.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.career();
        son.partner();
        Daughter daughter = new Daughter(24);

        daughter.career();
        daughter.partner();
        Parent.hello();
        son.normal();
    }
}
