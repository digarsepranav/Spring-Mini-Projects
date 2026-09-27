package Polymorphism;

public class poly {
    static void main(String[] args) {
        processPayment(new UPIPayment());
        processPayment(new CardPayment());
    }
    static void processPayment(Payment payment) {
        payment.pay();
    }
}
class Payment {
    void pay() {
        System.out.println("Payment");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("UPI Payment");
    }
}

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Card Payment");
    }
}