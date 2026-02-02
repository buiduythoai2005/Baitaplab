/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author 1000l
 */
class StandardShipping extends ShippingService {
    public StandardShipping(double d, double w) { super(d, w); }
    @Override public double calculateFee() { return distance * weight * 1000; }
}
