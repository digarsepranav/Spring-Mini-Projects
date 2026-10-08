package SOLID.L;

public class Main {
    static void main(String[] args) {
        Employee employee1 = new Developer();
        Employee employee2 = new Intern();

        employee2.work();
        employee1.work();
    }
}
