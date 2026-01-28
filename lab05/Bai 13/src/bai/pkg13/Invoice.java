/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg13;

public class Invoice {
    private String invoiceId;
    private double amount;
    private Customer customer; // HAS-A Customer

    public Invoice(String invoiceId, double amount, Customer customer) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.customer = customer;
    }

    public void display() {
        System.out.println("----- HÓA ĐƠN -----");
        System.out.println("Mã hóa đơn: " + invoiceId);
        System.out.println("Số tiền: " + amount);
        customer.display();
    }
}
