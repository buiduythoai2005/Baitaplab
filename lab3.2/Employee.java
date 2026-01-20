package Lap3_2.bai3;
import java.util.NavigableMap;
import java.util.Scanner;
public class Employee {
    private String ID;
    private String Name;
    private double Luong;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID:");
        ID = sc.nextLine();
        System.out.print("Nhập Tên:");
        Name = sc.nextLine();
        System.out.print("Nhập Lương:");
        Luong = sc.nextDouble();

    }




    public double calculateTax(){
        if(Luong > 10_000_000 ) {
            return Luong * 0.10;
        }
        return 0;
    }
    public void display(){
        System.out.print("ID:"+ID+"Name:"+ Name+"Lương:"+Luong);
    }
}
