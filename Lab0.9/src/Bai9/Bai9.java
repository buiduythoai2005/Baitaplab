/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
public class Bai9 {
    public static void main(String[] args) {
        DongVat[] thu = { new Cho("DOG", 2), new Chim("Sao", 1) };
        for (DongVat dv : thu) {
            dv.hienThi();
            dv.keu();
            if (dv instanceof CoTheBay) {
                ((CoTheBay) dv).bay();
            }
            System.out.println("---");
        }
    }
}
