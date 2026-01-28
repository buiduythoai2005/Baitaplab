package Lap06.bai4;

class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Diện tích: " + r.getArea());
    }
}
