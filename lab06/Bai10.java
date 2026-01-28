package Lap06.bai10;

abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployee extends Employee {
    private double fixedSalary;

    public OfficeEmployee(String id, String name, double salary) {
        super(id, name);
        this.fixedSalary = salary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

class SalesEmployee extends Employee {
    private double baseSalary;
    private double commission;

    public SalesEmployee(String id, String name, double baseSalary, double commission) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + commission;
    }
}

public class Bai10 {
    public static void main(String[] args) {
        Employee[] list = {
                new OfficeEmployee("E01", "An", 10000000),
                new SalesEmployee("E02", "Bình", 7000000, 3000000)
        };

        double total = 0;
        for (Employee e : list) {
            double salary = e.calculateSalary();
            System.out.println("Lương: " + salary);
            total += salary;
        }

        System.out.println("Tổng lương công ty: " + total);
    }
}
