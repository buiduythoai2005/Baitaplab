package Lap3_1.bai2;
import java.util.Scanner;
public class bai2 {
    private Float lenghth;
    private Float width;


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Chiều Dài: ");
        lenghth = sc.nextFloat();
        System.out.print("Nhập Chiều Rộng: ");
        width = sc.nextFloat();
    }
    public float DT(){
        return lenghth * width;
    }
    public float CV(){
        return (lenghth + width) * 2;
    }
    public void display(){
        System.out.println("Chiêù dài: "+lenghth+" Chiều Rộng: "+width);
        System.out.println("Diện Tích: "+DT());
        System.out.println("Chu Vi: "+CV());
    }

}
