/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu1;

/**
 *
 * @author 1000l
 */
public class MainBai1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId("239293");
        s1.setName("buiduythoai");
        s1.setScore(7.5);

        s1.display();

        if (s1.isPass()) {
            System.out.println("Chuc mung sinh vien da qua mon!");
        }
    }
}
