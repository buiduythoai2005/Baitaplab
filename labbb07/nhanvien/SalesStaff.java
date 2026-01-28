/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

public class SalesStaff extends Staff {
    private double baseSalary;
    private double sales;
    private double commissionRate;

    public SalesStaff(String name, double baseSalary,
                      double sales, double commissionRate) {
        super(name);
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getIncome() {
        return baseSalary + sales * commissionRate;
    }
}

