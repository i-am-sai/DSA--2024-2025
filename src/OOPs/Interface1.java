package OOPs;
// abstract class
abstract class Vehicle{
    //static field shared by all instance of vehicle
    static int vehicleCount =0;

    //abstract methods : must be implemented using a non absstract subclass
    abstract void start();
    abstract void stop();

    // Constructor to initialize common fields and not objects
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        vehicleCount++;
    }

    // Public field: Can be accessed directly from anywhere
    public String ownerName;

    // Final field: Cannot be changed after initialization
    final String vehicleType;

    //concrete methods : is a method that has a complete implementation (with a method body) in a class.
    // It is the opposite of an abstract method, which only has a declaration.
    void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Total Vehicles: " + vehicleCount);
    }
}

// subclass : car
class Car extends Vehicle{
    public Car(String ownerName){
        super(ownerName, "Car");
    }
    void start(){
        System.out.println(ownerName + "'s Car starts with a key ignition");
    }

    void stop(){
        System.out.println("Car stops using hydraulic brakes");
    }
}

// Subclass for Bike
class Bike extends Vehicle {
    // Constructor for Bike
    public Bike(String ownerName) {
        super(ownerName, "Bike");
    }

    @Override
    void start() {
        System.out.println(ownerName + "'s Bike starts with a kick or button ignition.");
    }

    @Override
    void stop() {
        System.out.println(ownerName + "'s Bike stops using disc brakes.");
    }
}

interface AdvanceVehicle{
    // Abstract methods in an interface (implicitly public and abstract)
    void accelerate();
    void honk();
}

interface NoOfTyres{
    static  final int tyres = 10;
    String engine = "Rear-Wheel Drive.";
    void engine();
}

class Truck extends Vehicle implements AdvanceVehicle, NoOfTyres{
    public Truck(String ownerName){
        super(ownerName, "Truck");
    }

    void start(){
        System.out.println(ownerName + "'s Truck starts with a push- button ignition");
    }

    @Override
    void stop() {
        System.out.println("Trucks stops using air brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerates slowly");
    }

    @Override
    public void honk() {
        System.out.println("Truck honks with loud horn");
    }

    @Override
    public void engine() {
        System.out.println("Truck has " + tyres + " wheels and has a " + engine );
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Car car = new Car("Sai Swaroop");
        Bike bike = new Bike("Shreya");
        Truck truck = new Truck("Chintu");

        //Display info
        car.displayInfo();
        car.start();
        car.stop();

        bike.displayInfo();
        bike.start();
        bike.stop();

        truck.displayInfo();
        truck.start();
        truck.stop();
        truck.accelerate();
        truck.honk();
        truck.engine();

    }
}
