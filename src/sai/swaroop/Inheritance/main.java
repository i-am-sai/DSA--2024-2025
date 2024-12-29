package sai.swaroop.Inheritance;

public class main {
    public static void main(String[] args) {
        Box a = new Box(2,3,4);
        System.out.println(a.l + " " + a.b + " " + a.w);
        Box b = new Box(5);
        System.out.println();
        Box c = new Box(a);
        //BoxWeight d = new BoxWeight();
        BoxWeight e = new BoxWeight(6,7,8,9);
        System.out.println(e.l + " " + e.weight );
        Box f = new BoxWeight(1,2,3,4);
        // Parent class is pointing to child class object creation
        // BoxWeight g = new Box(1,2,3,4,); : Cannot initialize this.
        // Here the child ref variable is creating a parent object, This is not possible
        BoxPrice box = new BoxPrice(1,2,3,4,70);
    }
}


