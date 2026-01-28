/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg13;

public class Bai13 {
    public static void main(String[] args) {
        Customer c = new Customer("Nguyễn Văn A");
        Invoice i = new Invoice("HD01", 2500000, c);
        i.display();
    }
}
