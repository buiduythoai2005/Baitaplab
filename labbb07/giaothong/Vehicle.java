/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaothong;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract int getMaxSpeed();

    public void showInfo() {
        System.out.println("Hãng xe: " + brand 
                + " | Tốc độ tối đa: " + getMaxSpeed() + " km/h");
    }
}
