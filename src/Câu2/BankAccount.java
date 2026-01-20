/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu2;

/**
 *
 * @author 1000l
 */
class BankAccount {
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
            System.out.println("Da nap: " + amount);
        } else {
            System.out.println("So tien nap khong hop le!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Da rut: " + amount);
        } else {
            System.out.println("So du khong du de rut!");
        }
    }

    public void displayInfo() {
        System.out.println("So TK: " + accountNumber + " | Chu TK: " + ownerName + " | So du: " + balance);
    }
}
