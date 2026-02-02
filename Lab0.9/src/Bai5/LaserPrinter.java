/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author 1000l
 */
class LaserPrinter extends Printer {
    public LaserPrinter(String n) { super(n); }
    @Override public void print() { System.out.println(printerName + ": In tia Laser."); }
}
