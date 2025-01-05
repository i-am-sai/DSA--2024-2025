package sai.swaroop;

public class ObjectClass {

    int num;

    public ObjectClass(int num){
        this.num =num;
    }

    @Override
    public String toString(){  // String reperesentation
        return super.toString();
    }
//
//    @Override
//    protected void finalize() throws Throwable {   // Grabage Collection
//        super.finalize();
//    }
//
    @Override
    public int hashCode() {
//        return super.hashCode(); // number representation of a object
    return num;
    } // hashcode : a unique representation of a object via number
//
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass) obj).num; // Casting

        // Safer Way of casting
//        if (this == obj) return true;                  // Same reference
//        if (obj == null || !(obj instanceof equalsOverride)) return false; // Check type
//        equalsOverride other = (equalsOverride) obj;   // Safe casting
//        return this.num == other.num;                  // Compare the values

    }
    @Override protected void finalize(){
            System.out.println("finalize method called");
        }


    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(7);
        ObjectClass obj2 = new ObjectClass(7);
        ObjectClass obj3 = obj1;

        Integer e = 7;
        Integer d = 7;
        System.out.println(e.equals(d));
        System.out.println(e == d);
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));


        System.out.println(obj1);    // Default toString is called : o/p : sai.swaroop.ObjectClass@7b23ec81

        if(obj1 == obj2){
            System.out.println(" == : Equals");
        }
        else {
            System.out.println("NotEqual");
        }

        if(obj1.equals(obj2)){
            System.out.println( "equalTO : Equals");
        }
        else {
            System.out.println("NotEqual");
        }
        System.out.println(obj1.hashCode());
        System.out.println(obj1);
        System.out.println(obj2.hashCode());

        Object o = new String("GeeksForGeeks");
        Class c = o.getClass();
        System.out.println("Class of Object o is: "
                + c.getName());

        System.out.println(o.hashCode());
        o  = null;
        System.gc();
        System.out.println("end");
    }
}

