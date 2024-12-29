package sai.swaroop;

public class Cloning implements Cloneable {

    private static Object Cloning;
    int rollno;
    String Name;

    Cloning(int roll, String name){
        this.rollno = roll;
        this.Name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    public static void main(String[] args) {
    }

}
