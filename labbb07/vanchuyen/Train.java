/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanchuyen;

public class Train extends Transport {

    public Train() {
        super("Tàu hỏa");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 3000;
    }

    @Override
    public int getCapacity() {
        return 200;
    }
}
