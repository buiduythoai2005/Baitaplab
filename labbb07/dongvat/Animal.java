/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongvat;

public abstract class Animal {
    protected String name; // tên động vật

    public Animal(String name) {
        this.name = name;
    }

    // BẮT BUỘC lớp con phải mô tả
    public abstract void makeSound();
    public abstract void move();

    // Hàm dùng chung cho mọi động vật
    public void show() {
        System.out.println("Động vật: " + name);
        makeSound();
        move();
        System.out.println();
    }
}
