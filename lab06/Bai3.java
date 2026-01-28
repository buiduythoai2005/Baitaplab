package Lap06.bai3;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " sủa: Gâu gâu");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Dog d = new Dog("Lu");
        d.sound();
    }
}
