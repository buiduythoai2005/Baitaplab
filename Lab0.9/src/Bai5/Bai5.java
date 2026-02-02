/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
public class Bai5 {
    public static void main(String[] args) {
        Printer p1 = new LaserPrinter("HP LaserJet");
        Printer p2 = new InkPrinter("Epson Color");
        Printer p3 = new PDFPrinter("Adobe PDF");

        p1.print();
        p2.print();
        p3.print();
    }
}
