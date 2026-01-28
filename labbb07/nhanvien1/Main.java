/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanvien1;

/**
 *
 * @author admin
 */

// ===== LỚP TRỪU TƯỢNG EMPLOYEE =====
abstract class Employee {
    String id;    // mã nhân viên
    String name;  // tên nhân viên

    // Constructor
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Phương thức trừu tượng: mỗi loại nhân viên tính lương khác nhau
    abstract double calculateSalary();

    // Hiển thị thông tin nhân viên
    void showInfo() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + calculateSalary());
    }
}

// ===== NHÂN VIÊN TOÀN THỜI GIAN =====
class FullTimeEmployee extends Employee {
    double monthlySalary; // lương cố định hàng tháng

    public FullTimeEmployee(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// ===== NHÂN VIÊN BÁN THỜI GIAN =====
class PartTimeEmployee extends Employee {
    int workingHours;    // số giờ làm việc
    double hourlyRate;   // lương theo giờ

    public PartTimeEmployee(String id, String name,
                            int workingHours, double hourlyRate) {
        super(id, name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }
}

// ===== HÀM MAIN =====
public class Main {

    public static void main(String[] args) {

        // Tạo nhân viên toàn thời gian
        Employee nv1 = new FullTimeEmployee(
                "FT01", "Nguyễn Văn A", 12000000);

        // Tạo nhân viên bán thời gian
        Employee nv2 = new PartTimeEmployee(
                "PT01", "Trần Thị B", 80, 50000);

        // Hiển thị thông tin
        nv1.showInfo();
        System.out.println();

        nv2.showInfo();
        System.out.println();

        // So sánh lương
        if (nv1.calculateSalary() > nv2.calculateSalary()) {
            System.out.println("Nhân viên " + nv1.name + " có lương cao hơn");
        } else if (nv1.calculateSalary() < nv2.calculateSalary()) {
            System.out.println("Nhân viên " + nv2.name + " có lương cao hơn");
        } else {
            System.out.println("Hai nhân viên có lương bằng nhau");
        }
    }
}

