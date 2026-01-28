/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg9;

public class Score {
    private double math;
    private double physics;
    private double chemistry;

    public Score(double math, double physics, double chemistry) {
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return (math + physics + chemistry) / 3;
    }
}

