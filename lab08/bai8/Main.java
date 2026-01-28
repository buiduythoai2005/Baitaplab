/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai8;

/**
 * Bài 8: Interface Payable
 * @author admin
 */

// ===== Interface Payable =====
interface Payable {

    // Tính lương cho đối tượng
    double calculateSalary();
}

// ===== Class FullTimeEmployee =====
class FullTimeEmployee implements Payable {

    private double baseSalary;

    public FullTimeEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // lương cố định
    }
}

// ===== Class PartTimeEmployee =====
class PartTimeEmployee implements Payable {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // lương theo giờ
    }
}

// ===== Class Contractor =====
class Contractor implements Payable {

    private double contractAmount;

    public Contractor(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount; // lương theo hợp đồng
    }
}

// ===== Main class =====
public class Main {

    // Phương thức trả lương cho bất kỳ đối tượng nào implement Payable
    static void paySalary(Payable p) {
        System.out.println("Salary: " + p.calculateSalary());
    }

    public static void main(String[] args) {

        Payable fullTime = new FullTimeEmployee(10000000);
        Payable partTime = new PartTimeEmployee(80, 50000);
        Payable contractor = new Contractor(15000000);

        // Gọi phương thức paySalary()
        paySalary(fullTime);
        paySalary(partTime);
        paySalary(contractor);
    }
}
