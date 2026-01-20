package Lap3_1.bai1;
import java.util.Scanner;
public class bai1 {
        private String ID;
        private String Name;
        private Float Score;

        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập ID:" );
            ID = sc.nextLine();
            System.out.print("Nhập Name: ");
            Name = sc.nextLine();
            System.out.print("Nhập Điểm: ");
            Score = sc.nextFloat();
        }
        public void display(){
            System.out.print("ID: "+ID);
            System.out.print("Name: "+Name);
            System.out.print("Điểm: "+Score);
            System.out.print("Kết Qủa: "+ (isPass() ? " lên " : "Xuống "));
        }
        public boolean isPass(){
            return Score >= 5;
        }
}
