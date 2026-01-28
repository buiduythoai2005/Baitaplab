/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nganhang;

public class Main {
    public static void main(String[] args) {

        // Tạo 2 tài khoản khác loại
        BankAccount acc1 = new SavingAccount("SA001", 10000000);
        BankAccount acc2 = new CheckingAccount("CA001", 5000000);

        // Thao tác với tài khoản tiết kiệm
        acc1.deposit(2000000);
        acc1.withdraw(3000000);
        double interest1 = acc1.calculateInterest();
        acc1.deposit(interest1); // cộng lãi vào số dư

        // Thao tác với tài khoản thanh toán
        acc2.deposit(1000000);
        acc2.withdraw(2000000);
        double interest2 = acc2.calculateInterest();
        acc2.deposit(interest2);

        // In số dư cuối
        System.out.println("=== SỐ DƯ CUỐI CÙNG ===");
        acc1.showBalance();
        acc2.showBalance();
    }
}

