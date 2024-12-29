class Bike{
    public int gear;
    public String name;

    public Bike(int gear, String name){
        this.name = name;
        this.gear = gear;
    }

    public String print(){
        return ("Transmission : " + gear + "\n" + "Name of the MotorCycle : " + name);
    }
}

class Adventure extends Bike{
    public String wheels;
    public Adventure(int gear, String name, String wheels){
        super(gear,name);
        this.wheels = wheels;
    }

    @Override public String print(){
        return (super.print() + "\n Wheels : " + wheels);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Adventure bike = new Adventure(5,"Himalayan", "Alloy");
        System.out.println(bike.print());
    }
}
