package Lap06.bai7;

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Bai7 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Rectangle(4, 5)
        };

        for (Shape s : shapes) {
            System.out.println("Diện tích: " + s.getArea());
        }
    }
}
