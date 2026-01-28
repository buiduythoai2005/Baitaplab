/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg6;

public class Bai6 {
    public static void main(String[] args) {
        Room r = new Room("Phòng khách", 35.5);
        House h = new House("H001", r);
        h.display();
    }
}

