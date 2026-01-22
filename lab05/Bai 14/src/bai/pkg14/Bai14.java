/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg14;

public class Bai14 {
    public static void main(String[] args) {
        Department d = new Department("PB01", "Nhân sự");
        Employee e = new Employee("NV01", "Bùi Duy Thoải", 12000000, d);
        e.display();
    }
}
