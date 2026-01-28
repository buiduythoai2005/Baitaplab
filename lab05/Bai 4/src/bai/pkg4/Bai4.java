/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg4;

public class Bai4 {
    public static void main(String[] args) {
        Author au = new Author("Nguyễn Nhật Ánh", "nnanh@gmail.com");
        Book bk = new Book("Cho tôi xin một vé đi tuổi thơ", 75000, au);
        bk.display();
    }
}

