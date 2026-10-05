package Encapsulation;

public class BankAccount {
    private double balance;

    void deposit(double money) {
        if (money > 0) {
            balance += money;
        }
    }

    void withdraw(double withdrawMoney) {
        if (withdrawMoney <= 0) {
            System.out.println("Can't get negative money! Are you out of ur mind");
        }
        if (withdrawMoney > balance) {
            System.out.println("Balance is less than you want! Gareeb");
        }
        else {
            balance -= withdrawMoney;
        }
    }

    double getBalance() {
        return balance;
    }
    static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(50000);
        b1.withdraw(56000);
        b1.withdraw(5000);
        System.out.println(b1.getBalance());
    }
}


