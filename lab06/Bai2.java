package Lap06.bai2;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + salary);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Employee e = new Employee("Bình", 30, 15000000);
        e.displayInfo();
    }
}
