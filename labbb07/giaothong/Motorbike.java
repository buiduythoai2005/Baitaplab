/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaothong;

public class Motorbike extends Vehicle {

    public Motorbike(String brand) {
        super(brand);
    }

    @Override
    public int getMaxSpeed() {
        return 120;
    }
}
