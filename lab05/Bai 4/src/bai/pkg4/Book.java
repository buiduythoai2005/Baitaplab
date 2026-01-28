/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg4;

public class Book {
    private String title;
    private double price;
    private Author author; // HAS-A Author

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void display() {
        System.out.println("----- THÔNG TIN SÁCH -----");
        System.out.println("Tiêu đề: " + title);
        System.out.println("Giá: " + price);
        author.display();
    }
}

