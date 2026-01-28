/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu5;

/**
 *
 * @author 1000l
 */
public class MainBai5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Tong 2 so nguyen (5+10): " + calc.add(5, 10));
        System.out.println("Tong 2 so thuc (5.5+2.3): " + calc.add(5.5, 2.3));
        System.out.println("Tong 3 so nguyen (1+2+3): " + calc.add(1, 2, 3));
    }
}
