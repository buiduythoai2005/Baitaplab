/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author 1000l
 */
interface CoTheBay { void bay(); }
class Chim extends DongVat implements CoTheBay {
    public Chim(String t, int tu) { super(t, tu); }
    @Override public void keu() { System.out.println("Chip chip!"); }
    @Override public void bay() { System.out.println("Dang bay la la..."); }
}
