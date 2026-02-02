/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
public class Bai1 {
    public static void main(String[] args) {
        Account a1 = new AdminAccount("thoai");
        Account a2 = new StudentAccount("mai");
        Account a3 = new GuestAccount("khach");

        System.out.println("User " + a1.username + " la: " + a1.getRole());
        System.out.println("User " + a2.username + " la: " + a2.getRole());
        System.out.println("User " + a3.username + " la: " + a3.getRole());
    }
}
