/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg3;

public class Student {
    private String id;
    private String name;
    private Department department; // HAS-A Department

    public Student(String id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("----- THÔNG TIN SINH VIÊN -----");
        System.out.println("Mã SV: " + id);
        System.out.println("Họ tên: " + name);
        department.display();
    }
}

