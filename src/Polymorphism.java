public class Polymorphism {

    //Method Overloading
    public int sum(int x, int y){
        return x+y;
    }

    public int sum(int x, int y, int z){
        return x*y*z;
    }

    public double sum(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        Polymorphism result = new Polymorphism(); //  object created
        System.out.println(result.sum(5,7));
        System.out.println(result.sum(1,4,5));
        System.out.println(result.sum(5.7,7.7));

        Account customer1 = new Account(50000, 150000);
        System.out.println(customer1.recipt());
    }
}

class Bank{
    private int balance;

    public Bank(int balance){
        this.balance = balance;
    }

    public String recipt(){
        return ("Current Balance : " + balance);
    }
}

class Account extends Bank{
    int newBalance;
    public Account(int balance, int newBalance){
        super(balance);
        this.newBalance = newBalance;
    }

  @Override  public String recipt(){      // method overiding
        return (super.recipt() + "\n Updated Balance is " + newBalance);
    }
}
