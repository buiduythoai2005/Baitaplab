/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
public class Bai4 {
    public static void main(String[] args) {
        ShippingService s1 = new StandardShipping(10, 2); // 10km, 2kg
        ShippingService s2 = new ExpressShipping(10, 2);
        ShippingService s3 = new SameDayShipping(10, 2);

        System.out.println("Phi Chuan: " + s1.calculateFee());
        System.out.println("Phi Nhanh: " + s2.calculateFee());
        System.out.println("Phi Hoa Toc: " + s3.calculateFee());
    }
}
