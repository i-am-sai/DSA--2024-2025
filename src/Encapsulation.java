public class Encapsulation {

    private String name; // Encapsulation principle: keep fields private

    // Constructor
    public Encapsulation(String name) {
        this.name = name; // Use 'this' to assign parameter to instance variable
    }

    // Setter method
    public void setName(String name) {
        this.name = name; // Resolving ambiguity
        System.out.println("Hello, new name: " + this.name);
    }

    // Getter method
    public String getName() {
        System.out.println(this.name); // Explicitly referencing instance variable
        return this.name;
    }

    // Method for method chaining
    public Encapsulation setNameAndReturn(String name) {
        this.name = name;
        return this; // Returning current object
    }

    public static void main(String[] args) {
        Encapsulation myDog = new Encapsulation("Johnny");
        myDog.setName("Gunda");
        myDog.getName();

        // Example of method chaining
        myDog.setNameAndReturn("Tiger").getName();
    }
}
