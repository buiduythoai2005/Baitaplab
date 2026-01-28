package Lap06.bai1;

class Person {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã SV: " + studentId);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student st = new Student("An", 20, "SV001");
        st.displayInfo();
    }
}

