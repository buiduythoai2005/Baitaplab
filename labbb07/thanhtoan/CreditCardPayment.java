/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

public class CreditCardPayment extends PaymentMethod {

    public CreditCardPayment() {
        super("Thanh toán thẻ tín dụng");
    }

    @Override
    public boolean pay(double amount) {
        return amount <= 10000000;
    }
}
