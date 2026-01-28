/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg11;

public class Teacher {
    private String name;
    private String degree;

    public Teacher(String name, String degree) {
        this.name = name;
        this.degree = degree;
    }

    public void display() {
        System.out.println("Giáo viên: " + name);
        System.out.println("Học vị: " + degree);
    }
}

