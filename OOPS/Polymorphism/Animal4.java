package Polymorphism;

public class Animal4 {
    void sound() {
        System.out.println("Animal sound");
    }
    void eat() {
        System.out.println("Animal eating");
    }

    static void main(String[] args) {
        Animal4 a4;
        a4 = new Cat2();
        a4.sound();

        a4 = new Tiger();
        a4.sound();
    }
}
class Cat2 extends Animal4{
    void sound() {
        System.out.println("Meow");
    }
}
class Tiger extends Animal4{
    void sound() {
        System.out.println("Rawrrrr");
    }
}
