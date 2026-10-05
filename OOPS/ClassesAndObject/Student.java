package ClassesAndObject;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println(name + " " + age);
    }

    static void main(String[] args) {
        Student s1 = new Student("Pranav", 21);
        Student s2 = new Student("Prachi", 24);
        s1.displayInfo();
        Student s3 = s1;
        s3.displayInfo();
    }
}
