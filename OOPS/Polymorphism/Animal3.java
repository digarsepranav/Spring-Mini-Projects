package Polymorphism;

// Downcasting

public class Animal3 {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eating");
    }
    public static void main(String[] args) {

        Animal3 a3 = new Dog3();
        Dog3 d3 = (Dog3) a3;
        d3.fetch();
        // parent ref child object -> ab child object aur ref bhi child chahiye to animal ko downcast kre but agar object animal wala dusra hai jasie cat hai aur hamne dog se downcast kre to bark me cat chalega
        // Parent ref se child ref tk ka safar if there was Cat3 instead of Dog3 it will show castError

        // safe way
        if (a3 instanceof Dog3) {
            Dog3 d4 = (Dog3) a3;
            d4.fetch();
        }
    }
}

class Dog3 extends Animal3 {

    @Override
    void sound() {
        System.out.println("Dog barking");
    }
    void fetch() {
        System.out.println("Fetch from dog");
    }
}
