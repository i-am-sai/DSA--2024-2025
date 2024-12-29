public class FinalKeyword {

    static class A {
        // final int a; final values always need to be initialized.
        final int b = 10;
        String name;

        public A(String name) {
            this.name = name;
        }

        public void getName(){
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {

        A Sai = new A("Sai Swaroop");
        Sai.getName();
        Sai = new A("DK");

        final A kunal = new A("Kunal Kushwa");

       // kunal = new A("ndf"); : Error
       // when a non primitive is final, you cannot reassign it.

    }

}
