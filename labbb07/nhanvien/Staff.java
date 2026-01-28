/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

public abstract class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public abstract double getIncome();

    public void showIncome() {
        System.out.println("Nhân viên: " + name +
                " | Thu nhập: " + getIncome() + " VND");
    }
}

