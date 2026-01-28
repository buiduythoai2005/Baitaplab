package Lap06.bai6;

class Employee {
    public double getSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double salary) {
        this.monthlySalary = salary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;

    public PartTimeEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getSalary() {
        return hours * rate;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Employee[] list = {
                new FullTimeEmployee(10000000),
                new PartTimeEmployee(80, 50000)
        };

        for (Employee e : list) {
            System.out.println("Lương: " + e.getSalary());
        }
    }
}
