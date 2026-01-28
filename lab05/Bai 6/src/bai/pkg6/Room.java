/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg6;

public class Room {
    private String roomName;
    private double area;

    public Room(String roomName, double area) {
        this.roomName = roomName;
        this.area = area;
    }

    public void display() {
        System.out.println("Phòng: " + roomName);
        System.out.println("Diện tích: " + area + " m2");
    }
}

