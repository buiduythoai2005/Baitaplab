/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author 1000l
 */
public class Bai7 {
    public static void main(String[] args) {
        NhanVien[] ds = {
            new NhanVienFullTime("FT1", "Nguyen Luong", 1000, 500),
            new NhanVienPartTime("PT1", "Tran Luong", 20, 15)
        };

        for (NhanVien nv : ds) {
            nv.hienThi();
            System.out.println("-> Luong: " + nv.tinhLuong());
        }
    }
}
