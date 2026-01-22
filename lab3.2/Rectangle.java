package Lap3_2.bai2;
import java.util.Scanner;
public class Rectangle {
    private float length;
    private float width;


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Chiều Dài:");
        length = sc.nextFloat();
        System.out.print("Nhập Chiều Rộng:");
        width = sc.nextFloat();

    }

    public double CV(){
        return (length + width) * 2;
    }
    public double DT(){
        return length * width;

    }

    public void display(){
        System.out.print("Chiều Dài:"+length+"Chiều Rộng:"+width);
    }
}
