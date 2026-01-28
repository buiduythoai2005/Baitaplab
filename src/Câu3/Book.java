/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu3;

/**
 *
 * @author 1000l
 */
public class Book {
    private String id;
    private String title;
    private double price;

    public Book() {
        this.price = 0;
    }

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Sach: " + title + " (ID: " + id + ") - Gia: " + price);
    }
}
