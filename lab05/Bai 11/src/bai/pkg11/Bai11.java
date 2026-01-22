/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg11;

public class Bai11 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Nguyễn Văn B", "Thạc sĩ");
        Subject s = new Subject("Lập trình Java", t);
        s.display();
    }
}

