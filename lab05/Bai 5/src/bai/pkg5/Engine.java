/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg5;

public class Engine {
    private String type;
    private int power;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public void display() {
        System.out.println("Động cơ: " + type);
        System.out.println("Công suất: " + power + " HP");
    }
}
