/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhtoan;

import java.util.ArrayList;

public class Thanhtoan {

    public static void main(String[] args) {

        double amount = 6000000;  // số tiền cần thanh toán

        ArrayList<PaymentMethod> list = new ArrayList<>();
        
        
        // Thêm các phương thức thanh toán
        list.add(new CashPayment());
        list.add(new CreditCardPayment());
        list.add(new EwalletPayment());

        for (PaymentMethod p : list) {
            System.out.println("Phương thức: " + p.methodName);

            if (p.pay(amount)) {
                System.out.println("Kết quả: Thanh toán THÀNH CÔNG");
                p.printReceipt(amount);
            } else {
                System.out.println("Kết quả: Thanh toán THẤT BẠI");
            }

            System.out.println();
        }
    }
}

