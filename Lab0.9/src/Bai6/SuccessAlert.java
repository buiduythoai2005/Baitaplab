/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
class SuccessAlert extends SystemAlert {
    public SuccessAlert(String m) { super(m); }
    @Override public void show() { System.out.println("✅ THANH CONG: " + message); }
}
