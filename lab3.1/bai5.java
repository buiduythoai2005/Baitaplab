package Lap3_1.bai5;

public class bai5 {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
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
