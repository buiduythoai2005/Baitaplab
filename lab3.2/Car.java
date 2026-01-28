package Lap3_2.bai7;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int value) {
        speed += value;
    }

    public void brake(int value) {
        speed -= value;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void displayStatus() {
        System.out.println("model: " + model + " – Speed: " + speed);
    }

    public boolean isOverSpeed() {
        return speed > 100;
    }
}
