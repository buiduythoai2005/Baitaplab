/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg5;

public class Bai5 {
    public static void main(String[] args) {
        Engine e = new Engine("V8", 450);
        Car c = new Car("Toyota", "Đen", e);
        c.display();
    }
}

