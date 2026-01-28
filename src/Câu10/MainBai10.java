/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu10;

/**
 *
 * @author 1000l
 */
public class MainBai10 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Co Lien", "CNTT");
        new ClassRoom("TT601", t1).display();
        new ClassRoom("TT602").display();
    }
}
