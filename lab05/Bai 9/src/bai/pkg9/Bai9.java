/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg9;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String name = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double math = sc.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double physics = sc.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double chemistry = sc.nextDouble();

        Score s = new Score(math, physics, chemistry);
        Student st = new Student(name, s);

        st.display();
    }
}

