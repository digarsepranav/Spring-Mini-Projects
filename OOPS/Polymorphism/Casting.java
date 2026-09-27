package Polymorphism;

public class Casting {

    class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
        void eat() {
            System.out.println("Animal Eating");
        }
    }
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
        void eat() {
            System.out.println("Dog eating");
        }
        void walk() {
            System.out.println("Dog walking");
        }
    }
    void main(String[] args) {
        // upcasting :
        Animal a = new Dog();
        a.eat();
        a.sound();
        // a.walk();  -> This doesnt work because its not present in the reference

        // downcasting
        Animal a1 = new Dog();

        Dog d = (Dog) a1;

        d.walk();

        /* safe way is to use instance of:
        Animal a = new Dog();

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
        }
        */
    }
}
