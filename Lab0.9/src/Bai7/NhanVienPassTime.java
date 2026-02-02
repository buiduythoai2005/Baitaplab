/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
class NhanVienPartTime extends NhanVien {
    private int gio;
    private double luongGio;
    public NhanVienPartTime(String m, String t, int g, double lg) {
        super(m, t); this.gio = g; this.luongGio = lg;
    }
    @Override public double tinhLuong() { return gio * luongGio; }
}
