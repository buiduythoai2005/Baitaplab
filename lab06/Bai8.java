package Lap06.bai8;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Xin chào, tôi tên là " + name);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Tôi dạy môn " + subject);
    }
}

public class Bai8 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Lan", "Java");
        t.introduce();
    }
}
