package Lap3_2.bai5;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ để rút");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void display() {
        System.out.println(
                "STK: " + accountNumber +
                        " – Chủ tài khoản: " + ownerName +
                        " – Số dư: " + balance
        );
    }
}
