/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

public class CashPayment extends PaymentMethod {

    public CashPayment() {
        super("Thanh toán tiền mặt");
    }

    @Override
    public boolean pay(double amount) {
        return true; // tiền mặt luôn thanh toán được
    }
}
