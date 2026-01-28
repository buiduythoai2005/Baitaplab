/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg11;

public class Subject {
    private String subjectName;
    private Teacher teacher; // HAS-A Teacher

    public Subject(String subjectName, Teacher teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("----- THÔNG TIN MÔN HỌC -----");
        System.out.println("Tên môn học: " + subjectName);
        teacher.display();
    }
}
