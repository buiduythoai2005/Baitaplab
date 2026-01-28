package Lap06.bai9;

class Animal {
    public void makeSound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

public class Bai9 {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
