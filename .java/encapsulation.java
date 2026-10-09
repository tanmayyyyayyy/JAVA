class Account {
    private double balance;
    public double getBalance() {
        return balance;
    }
public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(500);
        System.out.println("Balance: " + a.getBalance());
    }
}

