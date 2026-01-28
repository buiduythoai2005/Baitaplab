/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vanchuyen;

import java.util.ArrayList;

public class Vanchuyen {

    public static void main(String[] args) {

        double distance = 10; // quãng đường (km)

        ArrayList<Transport> list = new ArrayList<>();

        list.add(new Bus());
        list.add(new Taxi());
        list.add(new Train());

        Transport minCost = list.get(0);

        for (Transport t : list) {
            t.showInfo(distance);
            System.out.println();

            if (t.calculateCost(distance) < minCost.calculateCost(distance)) {
                minCost = t;
            }
        }

        System.out.println("➡ Phương tiện có chi phí thấp nhất:");
        System.out.println(minCost.name + " - " +
                minCost.calculateCost(distance) + " VND");
    }
}

