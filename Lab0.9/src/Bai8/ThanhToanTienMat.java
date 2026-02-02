/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author 1000l
 */
class ThanhToanTienMat extends PhuongThucThanhToan implements ThanhToan {
    public ThanhToanTienMat() { super("Tien mat"); }
    @Override public double phiGiaoDich(double tien) { return 0; }
    @Override public double thanhToan(double tien) {
        hienThi();
        System.out.println("Tra du: " + tien);
        return tien;
    }
}
