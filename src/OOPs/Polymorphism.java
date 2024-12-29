package OOPs;
// Payment System

class Payment{
    void makePayment(int amount){
        System.out.println("Making a payment of Rs." + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment(int amount){
        System.out.println(" Payment of  Rs." + amount + " made using credit card");
    }
}

class DebitCard extends Payment {
    @Override
    void makePayment(int amount){
        System.out.println(" Payment of  Rs." + amount + " made using debit card");
    }
}

class UPIpayment extends Payment{
    void Payment(int amount, String x){
        System.out.println("Payment of Rs." + amount + " made using " + x );
    }

    void Payment(int amount, String x, String str){
        System.out.println("Payment of Rs." + amount + " made using " + x  + " and showing " + str);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment debitCard = new DebitCard();
        UPIpayment upi = new UPIpayment();
        creditCard.makePayment(2500000);
        debitCard.makePayment(300000);
        upi.makePayment(90);
        upi.Payment(100,"Gpay");
        upi.Payment(400,"PhonePe","Insufficient Balance!");
    }
}
