/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg10;

public class Flight {
    private String flightCode;
    private Time departureTime; // HAS-A Time

    public Flight(String flightCode, Time departureTime) {
        this.flightCode = flightCode;
        this.departureTime = departureTime;
    }

    public void display() {
        System.out.println("----- THÔNG TIN CHUYẾN BAY -----");
        System.out.println("Mã chuyến bay: " + flightCode);
        System.out.print("Giờ khởi hành: ");
        departureTime.display();
    }
}

