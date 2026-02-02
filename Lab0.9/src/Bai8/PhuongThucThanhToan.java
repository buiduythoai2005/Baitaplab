/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
abstract class PhuongThucThanhToan {
    protected String ten;
    public PhuongThucThanhToan(String t) { this.ten = t; }
    public abstract double phiGiaoDich(double tien);
    public void hienThi() { System.out.println("Kieu: " + ten); }
}
