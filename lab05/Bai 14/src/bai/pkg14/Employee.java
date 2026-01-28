/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg14;

public class Employee {
    private String id;
    private String name;
    private double salary;
    private Department department; // HAS-A Department

    public Employee(String id, String name, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void display() {
        System.out.println("----- THÔNG TIN NHÂN VIÊN -----");
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
        department.display();
    }
}
