/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanchuyen;

public class Bus extends Transport {

    public Bus() {
        super("Xe buýt");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 5000;
    }

    @Override
    public int getCapacity() {
        return 40;
    }
}

