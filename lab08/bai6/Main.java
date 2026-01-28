/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 * Bài 6: Kế thừa Interface
 * @author admin
 */

// ===== Interface Animal =====
interface Animal {

    // Hành động ăn
    void eat();
}

// ===== Interface Mammal (kế thừa Animal) =====
interface Mammal extends Animal {

    // Hành động chạy
    void run();
}

// ===== Class Dog =====
class Dog implements Mammal {

    // Bắt buộc implement eat() từ Animal
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Bắt buộc implement run() từ Mammal
    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}
