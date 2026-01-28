/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg1;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private Address address;

    public Student() {
        address = new Address();
    }

    public void input(Scanner sc) {
        System.out.print("Nhập mã sinh viên: ");
        id = sc.nextLine();

        System.out.print("Nhập họ tên sinh viên: ");
        name = sc.nextLine();

        System.out.println("Nhập thông tin địa chỉ:");
        address.input(sc);
    }

    public void display() {
        System.out.println("----- THÔNG TIN SINH VIÊN -----");
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Họ tên: " + name);
        address.display();
    }
}


