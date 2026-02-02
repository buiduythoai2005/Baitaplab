/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
class NhanVienFullTime extends NhanVien {
    private double lcb, thuong;
    public NhanVienFullTime(String m, String t, double l, double th) {
        super(m, t); this.lcb = l; this.thuong = th;
    }
    @Override public double tinhLuong() { return lcb + thuong; }
}
