/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;

/**
 * Bài 7: Functional Interface và Lambda Expression
 * @author admin
 */

// ===== Functional Interface Calculator =====
@FunctionalInterface
interface Calculator {

    // Phương thức trừu tượng duy nhất
    int operate(int a, int b);
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        // Lambda expression cho phép cộng
        Calculator add = (a, b) -> a + b;

        // Lambda expression cho phép trừ
        Calculator subtract = (a, b) -> a - b;

        // Lambda expression cho phép nhân
        Calculator multiply = (a, b) -> a * b;

        // Test các phép toán
        System.out.println("Add: " + add.operate(5, 3));        // 8
        System.out.println("Subtract: " + subtract.operate(5, 3)); // 2
        System.out.println("Multiply: " + multiply.operate(5, 3)); // 15
    }
}

