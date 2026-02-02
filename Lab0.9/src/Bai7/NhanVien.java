/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
abstract class NhanVien {
    protected String maNV, tenNV;
    public NhanVien(String m, String t) { this.maNV = m; this.tenNV = t; }
    public abstract double tinhLuong();
    public void hienThi() { System.out.println(maNV + " - " + tenNV); }
}
