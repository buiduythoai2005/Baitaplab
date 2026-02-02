/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
public class Bai3 {
    public static void main(String[] args) {
        LoginMethod l1 = new PasswordLogin("user123");
        LoginMethod l2 = new GoogleLogin("sep@gmail.com");
        LoginMethod l3 = new FacebookLogin("fb_id_999");

        l1.login();
        l2.login();
        l3.login();
    }
}
