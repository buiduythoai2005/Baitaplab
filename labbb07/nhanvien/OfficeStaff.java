/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

public class OfficeStaff extends Staff {
    private double fixedSalary;

    public OfficeStaff(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getIncome() {
        return fixedSalary;
    }
}

