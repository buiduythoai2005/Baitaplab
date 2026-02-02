/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author 1000l
 */
class FacebookLogin extends LoginMethod {
    public FacebookLogin(String id) { super(id); }
    @Override public void login() { System.out.println("Dang nhap bang FACEBOOK cho: " + userId); }
}
