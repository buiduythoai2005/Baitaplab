/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

public abstract class PaymentMethod {
    protected String methodName;
    // Tên phương thức thanh toán (tiền mặt, thẻ, ví...)

    public PaymentMethod(String methodName) {
        this.methodName = methodName;
    }
    // BẮT BUỘC lớp con phải viết cách thanh toán
    public abstract boolean pay(double amount);
    
    
    // DÙNG CHUNG cho tất cả các phương thức
    public void printReceipt(double amount) {
        System.out.println("---- BIÊN LAI ----");
        System.out.println("Phương thức: " + methodName);
        System.out.println("Số tiền: " + amount + " VND");
        System.out.println("------------------");
    }
}
