/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu4;

/**
 *
 * @author 1000l
 */
public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void display() {
        System.out.println("NV: " + name + " | ID: " + id + " | Luong: " + salary);
    }
}
