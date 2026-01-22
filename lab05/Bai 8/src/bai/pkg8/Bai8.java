/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo tài khoản
        Account acc = new Account("admin", "123456");

        // Tạo user gắn với tài khoản
        User user = new User("Bùi Duy Thoải", acc);

        // Nhập thông tin đăng nhập và kiểm tra
        user.login(sc);
    }
}

