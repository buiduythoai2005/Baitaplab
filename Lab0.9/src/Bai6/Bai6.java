/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
public class Bai6 {
    public static void main(String[] args) {
        SystemAlert a1 = new WarningAlert("Pin yeu!");
        SystemAlert a2 = new ErrorAlert("Khong the ket noi Database!");
        SystemAlert a3 = new SuccessAlert("Luu du lieu thanh cong.");

        a1.show();
        a2.show();
        a3.show();
    }
}
