/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaothong;

import java.util.ArrayList;

public class Giaothong {

    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        Vehicle car = new Car("Toyota");
        Vehicle bike = new Motorbike("Honda");

        list.add(car);
        list.add(bike);

        for (Vehicle v : list) {
            v.showInfo();
        }
    }
}

