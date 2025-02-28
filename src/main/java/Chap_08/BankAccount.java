package Chap_08;

public class BankAccount {
    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount deposit(double amount) {
        return new BankAccount(this.accountNumber, this.balance + amount);
    }

    public BankAccount withdraw(double amount) {
        if(amount > this.balance) {
            throw new IllegalArgumentException("Amount cannot be greater than balance");
        }
        return new BankAccount(this.accountNumber, this.balance - amount);
    }
}
