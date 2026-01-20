/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu8;

/**
 *
 * @author 1000l
 */
public class Department {
    private String deptName;
    private EmployeeV2 employee;

    public Department(String deptName, EmployeeV2 employee) {
        this.deptName = deptName;
        this.employee = employee;
    }
    public void display() {
        System.out.println("Phong ban: " + deptName + " | Truong phong: " + employee.toString());
    }
}
