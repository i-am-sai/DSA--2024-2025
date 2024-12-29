public class ExceptionHandling {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try {
            int result = dividend / divisor; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            // Additional error handling code can be added here
        }finally {
            System.out.println("This block will always execute.");
        }



        String str = null; // Initializing a String variable to null
        try {
            int length = str.length(); // Attempting to call a method on a null reference
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
            // Additional error handling code can be added here
        }

        try {
            throw new Exception("This is 1st a thrown exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            method();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    public static void method() throws Exception {
        throw new Exception("This is 2nd a thrown exception");
    }

}
