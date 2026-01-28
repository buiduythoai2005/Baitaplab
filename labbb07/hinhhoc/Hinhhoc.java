/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhhoc;

import java.util.ArrayList;

public class Hinhhoc {

    public static void main(String[] args) {

        ArrayList<GeometricObject> list = new ArrayList<>();

        list.add(new Rectangle(5, 3)); // hình chữ nhật
        list.add(new Square(4));       // hình vuông
        list.add(new Circle(2));       // hình tròn

        for (GeometricObject g : list) {
            g.show();
            System.out.println("-----------------");
        }
    }
}

