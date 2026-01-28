/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu7;

/**
 *
 * @author 1000l
 */
public class StudentV2 {
    private String id;
    private String name;
    private Address address;

    public StudentV2(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display() {
        System.out.println("Sinh vien: " + name + " - Dia chi: " + address.toString());
    }
}
