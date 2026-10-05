package Polymorphism;

// UPCASTING

public class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eating");
    }
    public static void main(String[] args) {

        Dog2 d2 = new Dog2();
        Animal2 a2 = d2;

        // Child object is accessed via the Parent reference

        // Instead can also use Animal a = new Dog() -> Does the same thing

    }
}

class Dog2 extends Animal2 {

    @Override
    void sound() {
        System.out.println("Dog barking");
    }
}
