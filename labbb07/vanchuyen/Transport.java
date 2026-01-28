/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanchuyen;

public abstract class Transport {
    protected String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract double calculateCost(double distance);

    public abstract int getCapacity();

    public void showInfo(double distance) {
        System.out.println("Phương tiện: " + name);
        System.out.println("Chi phí: " + calculateCost(distance) + " VND");
        System.out.println("Sức chứa: " + getCapacity() + " người");
    }
}
