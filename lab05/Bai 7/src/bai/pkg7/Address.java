/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg7;

import java.util.Scanner;

public class Address {
    private String street;
    private String city;

    public void input(Scanner sc) {
        System.out.print("Nhập tên đường: ");
        street = sc.nextLine();
        System.out.print("Nhập thành phố: ");
        city = sc.nextLine();
    }

    public void display() {
        System.out.println("Địa chỉ: " + street + ", " + city);
    }
}
