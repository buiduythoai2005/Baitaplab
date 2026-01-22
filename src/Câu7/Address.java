/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu7;

/**
 *
 * @author 1000l
 */
public class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String toString() { return street + ", " + city; }
}
