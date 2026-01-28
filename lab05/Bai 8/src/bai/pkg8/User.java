/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg8;

import java.util.Scanner;

public class User {
    private String name;
    private Account account; // HAS-A Account

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void login(Scanner sc) {
        System.out.print("Nhập username: ");
        String u = sc.nextLine();
        System.out.print("Nhập password: ");
        String p = sc.nextLine();

        if (account.checkLogin(u, p)) {
            System.out.println("✅ Đăng nhập thành công! Xin chào " + name);
        } else {
            System.out.println("❌ Đăng nhập thất bại!");
        }
    }
}

