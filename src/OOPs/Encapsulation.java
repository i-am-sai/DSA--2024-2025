package OOPs;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    BankAccount(String name, String number, double balance){
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance =balance;
    }

    // Public getter for account holder name
    public String getAccountHolderName(){
        return accountHolderName;
    }

    // Public setter for account holder name
    public void setAccountHolderName(String name){
        this.accountHolderName = name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    // No setter for account number to prevent modification after creation

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs." + amount + " deposited successfully. New available balance is: " + balance);
        } else {
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully. New available balance is: " + balance);
        } else{
            System.out.println("Invalid withdrawel amount or Insufficient balance! ");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sai", "56788390", 10000);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.setAccountHolderName("Sai Swaroop K Devarmane");
        System.out.println("Updated Account Holder name: " + account.getAccountHolderName());

        account.deposit(5000);
        account.withdraw(20000);
    }
}
