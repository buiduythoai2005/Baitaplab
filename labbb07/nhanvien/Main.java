/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanvien;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Staff> list = new ArrayList<>();

        list.add(new OfficeStaff("An", 8000000));
        list.add(new OfficeStaff("Bình", 9000000));
        list.add(new SalesStaff("Chi", 5000000, 20000000, 0.05));
        list.add(new SalesStaff("Dũng", 6000000, 15000000, 0.04));

        double totalIncome = 0;

        for (Staff s : list) {
            s.showIncome();
            totalIncome += s.getIncome();
        }

        System.out.println("-------------------------");
        System.out.println("Tổng thu nhập công ty: " + totalIncome + " VND");
    }
}
