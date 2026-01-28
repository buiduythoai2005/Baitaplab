/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg6;

public class House {
    private String houseId;
    private Room room; // HAS-A Room

    public House(String houseId, Room room) {
        this.houseId = houseId;
        this.room = room;
    }

    public void display() {
        System.out.println("----- THÔNG TIN NHÀ -----");
        System.out.println("Mã nhà: " + houseId);
        room.display();
    }
}

