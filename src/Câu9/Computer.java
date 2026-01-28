/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu9;

/**
 *
 * @author 1000l
 */
public class Computer {
    private String model;
    private CPU cpu;

    public Computer(String model, CPU cpu) { this.model = model; this.cpu = cpu; }
    public void displayInfo() {
        System.out.println("May tinh Model: " + model + " | CPU: " + cpu.getDetails());
    }
}