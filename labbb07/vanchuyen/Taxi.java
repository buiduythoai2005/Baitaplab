/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanchuyen;

public class Taxi extends Transport {

    public Taxi() {
        super("Taxi");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 12000;
    }

    @Override
    public int getCapacity() {
        return 4;
    }
}

