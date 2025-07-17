interface BankOperations {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankOperations {
    String accountHolderName;
    String bankName;
    double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", "ICICI", 10000);
        BankAccount acc2 = new BankAccount("Sneha", "HDFC", 15000);
        BankAccount acc3 = new BankAccount("Amit", "SBI", 20000);

        acc1.deposit(5000);
        acc1.withdraw(3000);
        System.out.println(acc1.accountHolderName + " (" + acc1.bankName + ") Balance: " + acc1.getBalance());

        acc2.deposit(2000);
        acc2.withdraw(1000);
        System.out.println(acc2.accountHolderName + " (" + acc2.bankName + ") Balance: " + acc2.getBalance());

        acc3.deposit(10000);
        acc3.withdraw(5000);
        System.out.println(acc3.accountHolderName + " (" + acc3.bankName + ") Balance: " + acc3.getBalance());
    }
}
