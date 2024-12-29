package sai.swaroop.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power  Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerates");
    }
}
