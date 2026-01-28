/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg15;

public class ClassRoom {
    private String className;
    private Teacher teacher; // HAS-A Teacher

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("Lớp học: " + className);
        teacher.display();
    }
}
