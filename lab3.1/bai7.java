package Lap3_1.bai7;

public class bai7 {
    private String brand;
    private String model;
    private int speed;

    public void accelerate(int value) {
        speed += value;
    }

    public void brake(int value) {
        speed -= value;
        if (speed < 0) speed = 0;
    }

    public boolean isOverSpeed() {
        return speed > 100;
    }

    public void displayStatus() {
        System.out.println("model: " + model + " – Speed: " + speed);
    }
}
