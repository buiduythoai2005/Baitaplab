/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu10;

/**
 *
 * @author 1000l
 */
public class ClassRoom {
    private String className;
    private Teacher teacher;

    public ClassRoom(String className) { this.className = className; }
    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public void display() {
        System.out.print("Lop: " + className + " | ");
        if (teacher != null) System.out.println("GVCN: " + teacher.getName() + " (" + teacher.getSpec() + ")");
        else System.out.println("Chua co GVCN.");
    }
}
