/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
public class Bai2 {
    public static void main(String[] args) {
        Report r1 = new PDFReport("Do an Tot nghiep");
        Report r2 = new ExcelReport("Bang luong Thang 1");
        Report r3 = new WordReport("Don xin nghi phep");

        r1.generate();
        r2.generate();
        r3.generate();
    }
}
