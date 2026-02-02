/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
class ThanhToanThe extends PhuongThucThanhToan implements ThanhToan {
    public ThanhToanThe() { super("The Tin Dung"); }
    @Override public double phiGiaoDich(double tien) { return tien * 0.02; }
    @Override public double thanhToan(double tien) {
        double phi = phiGiaoDich(tien);
        hienThi();
        System.out.println("Goc: " + tien + " + Phi: " + phi + " = Tong: " + (tien + phi));
        return tien + phi;
    }
}
