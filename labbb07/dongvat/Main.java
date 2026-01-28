/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dongvat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Chó Vàng"));
        animals.add(new Cat("Mèo Mun"));
        animals.add(new Bird("Chim Sẻ"));

        for (Animal a : animals) {
            a.show();
        }
    }
}
