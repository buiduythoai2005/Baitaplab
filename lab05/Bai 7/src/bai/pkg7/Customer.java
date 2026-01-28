/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg7;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name;
    private Address address; // HAS-A Address

    public Customer() {
        address = new Address();
    }

    public void input(Scanner sc) {
        System.out.print("Nhập mã khách hàng: ");
        id = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        name = sc.nextLine();

        System.out.println("Nhập địa chỉ liên hệ:");
        address.input(sc);
    }

    public void display() {
        System.out.println("----- THÔNG TIN KHÁCH HÀNG -----");
        System.out.println("Mã KH: " + id);
        System.out.println("Tên KH: " + name);
        address.display();
    }
}

