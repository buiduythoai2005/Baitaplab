package Lap06.bai5;

class Vehicle {
    protected String brand;

    public void start() {
        System.out.println("Xe đang khởi động");
    }
}

class Car extends Vehicle {
    protected int seatCount;
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, int seatCount, int batteryCapacity) {
        this.brand = brand;
        this.seatCount = seatCount;
        this.batteryCapacity = batteryCapacity;
    }

    public void showInfo() {
        System.out.println("Hãng: " + brand);
        System.out.println("Số chỗ: " + seatCount);
        System.out.println("Dung lượng pin: " + batteryCapacity);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar("Tesla", 5, 100);
        ec.start();
        ec.showInfo();
    }
}
