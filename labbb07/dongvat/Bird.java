/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongvat;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiếng kêu: Hót líu lo");
    }

    @Override
    public void move() {
        System.out.println("Di chuyển: Bay");
    }
}

