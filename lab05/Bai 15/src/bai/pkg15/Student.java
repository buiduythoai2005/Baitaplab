/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg15;

public class Student {
    private String name;
    private ClassRoom classRoom; // HAS-A ClassRoom

    public Student(String name, ClassRoom classRoom) {
        this.name = name;
        this.classRoom = classRoom;
    }

    public void display() {
        System.out.println("----- THÔNG TIN -----");
        System.out.println("Sinh viên: " + name);
        classRoom.display();
    }
}
