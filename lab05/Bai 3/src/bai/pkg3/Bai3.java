/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg3;

public class Bai3 {
    public static void main(String[] args) {
        Department d = new Department("CNTT", "Công nghệ thông tin");
        Student s = new Student("SV01", "Bùi Duy Thoải", d);
        s.display();
    }
}

