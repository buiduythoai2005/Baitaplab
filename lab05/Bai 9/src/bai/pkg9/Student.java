/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg9;

public class Student {
    private String name;
    private Score score; // HAS-A Score

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println("Học sinh: " + name);
        System.out.printf("Điểm trung bình: %.2f%n", score.getAverage());
    }
}
