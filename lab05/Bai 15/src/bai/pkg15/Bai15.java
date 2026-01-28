/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg15;

public class Bai15 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Nguyễn Văn A");
        ClassRoom c = new ClassRoom("CNTT K15", t);
        Student s = new Student("Bùi Duy Thoải", c);
        s.display();
    }
}
