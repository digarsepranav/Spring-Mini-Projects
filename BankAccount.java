public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // contructor initalizing all : 
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // deposit method :
    public double deposit(double deposit) {
        double total = balance + deposit;
        balance = total;
        return total; 
    }

    // withdraw method :
    public double withdraw(double withdraw) {
        if (balance - withdraw >= 0) {
            return balance - withdraw;
        }
        return balance;
    }

    // check balance :
    public double checkBalance() {
        return balance;
    }

    // encaptualting so user cant access the internals of the code
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(35622802, "Pranav Digarse", 4862.02);
    }
}
