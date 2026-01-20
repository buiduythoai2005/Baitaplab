package Lap3_2.bai1;
import java.util.Scanner;
public class bai1 {
    private String ID;
    private String Name;
    private Double score;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID:");
        ID = sc.nextLine();
        System.out.print("Nhập Tên:");
        Name = sc.nextLine();
        System.out.print("Nhập Điểm:");
        score = sc.nextDouble();
    }
    public void display(){
        System.out.print("ID:"+ID+"Name"+Name+"Điểm:"+score);
    }
    public boolean ispass(){
        return score >= 5;
    }
}
