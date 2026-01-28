/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg2;

public class Employee {
    private String id;
    private String name;
    private MyDate birthDate; // HAS-A MyDate

    public Employee(String id, String name, MyDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public void display() {
        System.out.println("----- THÔNG TIN NHÂN VIÊN -----");
        System.out.println("Mã NV: " + id);
        System.out.println("Họ tên: " + name);
        System.out.print("Ngày sinh: ");
        birthDate.display();
        System.out.println();
    }
}

