/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
class WordReport extends Report {
    public WordReport(String t) { super(t); }
    @Override public void generate() { System.out.println("Xuat file Word: " + title); }
}
