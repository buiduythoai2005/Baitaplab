/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
class GuestAccount extends Account {
    public GuestAccount(String u) { super(u); }
    @Override public String getRole() { return "GUEST"; }
}