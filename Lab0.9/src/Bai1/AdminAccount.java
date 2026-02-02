/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author 1000l
 */
class AdminAccount extends Account {
    public AdminAccount(String username) { super(username); }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}
