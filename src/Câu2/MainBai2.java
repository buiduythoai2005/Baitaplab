/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu2;

/**
 *
 * @author 1000l
 */
public class MainBai2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("287487482", "bui duy thoai", 1000);
        myAcc.deposit(112233);
        myAcc.withdraw(20000);
        myAcc.displayInfo();
    }
}
