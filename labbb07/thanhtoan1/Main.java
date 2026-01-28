/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhtoan1;

/**
 *
 * @author admin
 */

// ===== LỚP TRỪU TƯỢNG PAYMENTMETHOD =====
abstract class PaymentMethod {
    String methodName; // tên phương thức thanh toán

    public PaymentMethod(String methodName) {
        this.methodName = methodName;
    }

    // thực hiện thanh toán (thành công hay thất bại)
    abstract boolean pay(double amount);
    
    // in biên lai
    void printReceipt(double amount) {
        System.out.println("----- BIÊN LAI -----");
        System.out.println("Phương thức: " + methodName);
        System.out.println("Số tiền: " + amount);
        System.out.println("-------------------");
    }
}

// ===== THANH TOÁN TIỀN MẶT =====
class CashPayment extends PaymentMethod {

    public CashPayment() {
        super("Thanh toán tiền mặt");
    }

    @Override
    boolean pay(double amount) {
        // tiền mặt: luôn thành công
        return true;
    }
}

// ===== THANH TOÁN THẺ TÍN DỤNG =====
class CreditCardPayment extends PaymentMethod {

    public CreditCardPayment() {
        super("Thanh toán thẻ tín dụng");
    }

    @Override
    boolean pay(double amount) {
        // giả sử thẻ chỉ thanh toán tối đa 10 triệu
        return amount <= 10_000_000;
    }
}

// ===== THANH TOÁN VÍ ĐIỆN TỬ =====
class EwalletPayment extends PaymentMethod {

    public EwalletPayment() {
        super("Thanh toán ví điện tử");
    }

    @Override
    boolean pay(double amount) {
        // giả sử ví chỉ thanh toán tối đa 5 triệu
        return amount <= 5_000_000;
    }
}

// ===== HÀM MAIN =====
public class Main {

    public static void main(String[] args) {

        double amount = 7_000_000; // số tiền cần thanh toán

        // Danh sách các phương thức thanh toán
        PaymentMethod[] methods = {
            new CashPayment(),
            new CreditCardPayment(),
            new EwalletPayment()
        };

        // Thực hiện thanh toán
        for (PaymentMethod pm : methods) {
            System.out.println("Phương thức: " + pm.methodName);

            boolean success = pm.pay(amount);

            if (success) {
                System.out.println("Kết quả: Thanh toán THÀNH CÔNG");
                pm.printReceipt(amount);
            } else {
                System.out.println("Kết quả: Thanh toán THẤT BẠI");
            }
            System.out.println("=======================");
        }
    }
}
