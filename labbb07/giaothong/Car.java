/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaothong;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}

