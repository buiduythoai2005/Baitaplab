/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nganhang;

public abstract class BankAccount {
    protected String accountNumber; // số tài khoản
    protected double balance;        // số dư

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // BẮT BUỘC lớp con phải viết cách tính lãi
    public abstract double calculateInterest();

    // Nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Rút tiền (chỉ rút khi đủ tiền)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("❌ Không đủ số dư để rút");
        }
    }

    // In số dư
    public void showBalance() {
        System.out.println("Tài khoản: " + accountNumber +
                " | Số dư: " + balance + " VND");
    }
}
