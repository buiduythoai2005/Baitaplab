/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
abstract class DongVat {
    protected String ten;
    protected int tuoi;
    public DongVat(String t, int tu) { this.ten = t; this.tuoi = tu; }
    public abstract void keu();
    public void hienThi() { System.out.println(ten + " (" + tuoi + " tuoi)"); }
}
