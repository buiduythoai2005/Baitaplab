/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 * Bài 1: Interface Drawable
 * @author admin
 */

// ===== Interface Drawable =====
interface Drawable {

    // Phương thức trừu tượng
    void draw();  // mặc định là public abstract
}

// ===== Class Circle =====
class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        Drawable c = new Circle(); // đa hình
        c.draw(); // gọi phương thức draw()
    }
}

