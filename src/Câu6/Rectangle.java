/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu6;

/**
 *
 * @author 1000l
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() { width = 1; height = 1; }
    public Rectangle(double side) { width = side; height = side; }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() { return width * height; }
    public void displayInfo() {
        System.out.println("Rong: " + width + ", Cao: " + height + " -> Dien tich: " + getArea());
    }
}
