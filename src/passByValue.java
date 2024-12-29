public class passByValue {

    int value;

    public static void main(String[] args) {

        // Primitive
        int num = 10;
        modify(num); // A copy of `num` (value 10) is passed to the method //20
        System.out.println(num); // Outputs: 10 (original value unchanged)


        // OBJECT
       passByValue obj = new passByValue();
       obj.value = 10;
       modify1(obj);
        System.out.println(obj.value); // o/p = 20 (objects content changed)

     changeReference(obj);
        System.out.println(obj.value); // 0/p : 20 (original reference unchanged)
    }


    static void modify(int value) {
        value = 20; // Modifies the copy, not the original `num`
        System.out.println(value); // 0/p = 20
    }

    static void modify1(passByValue obj){
        obj.value = 20;  // changes the object content
    }

    static void changeReference(passByValue obj){
        obj = new passByValue();
        obj.value = 30;   // This does not affect the original object
    }
}
