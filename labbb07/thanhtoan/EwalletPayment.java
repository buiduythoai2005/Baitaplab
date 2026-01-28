/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

public class EwalletPayment extends PaymentMethod {

    public EwalletPayment() {
        super("Thanh toán ví điện tử");
    }

    @Override
    public boolean pay(double amount) {
        return amount <= 5000000;
    }
}

