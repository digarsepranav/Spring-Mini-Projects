package Polymorphism;

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eating");
    }
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

        a1.eat();
        a2.eat();

//        a1.fetch(); -> Compile error
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barking");
    }

    void fetch() {
        System.out.println("Dog fetching");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meowing");
    }
}


