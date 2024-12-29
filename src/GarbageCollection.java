public class GarbageCollection {

    static class A {

        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }

    public static void main(String[] args) {

        FinalKeyword.A obj;
        for(int i = 0; i <1000000; i++){  // Overloading the memory, Of it cam manage load the finalize method will be not called.
            obj = new FinalKeyword.A("Random");
        }
    }
}
