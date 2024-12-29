
interface A{
    void bike();
    void car();          // abstract methods
    default void cycle() {           // non abstract methods
        int wheels = 2;
        String engine = "Chain";
        System.out.println("Cycle : " + wheels + " " + engine);
    }
}

abstract class B implements A{
    int oil = 2;
    int speed = 100;

    public B(int oil, int speed){
        this.oil = oil;
        this.speed = speed;
    }

    public void bike(){
        int wheels = 2;
        String engine = "motor";
        System.out.println("Bike : " + wheels + " " + engine);
    }

    public String recipt(){
        return ("Oil " + oil + "Speed " + speed);
    }
}

class C extends B{
    String car = "porsche";

    public C(int oil, int speed, String car){
        super(oil,speed);
        this.car = car;
    }
    public void car(){
        int wheels = 4;
        String engine = "V8 engine";
        System.out.println("Car : " + wheels + " " + engine);
    }

   @Override public String recipt(){
        return (super.recipt() + "\n Super car is : " + car);
    }
}

public class Abstraction {

    public static void main(String[] args) {

        A vehicle = new C(77, 200, "Range Rover");
        vehicle.cycle();
        vehicle.bike();
        vehicle.car();
    }
}
