package SOLID.L;

public class Developer implements Employee, SalariedEmployee {
    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    @Override
    public double salary() {
        return 100000;
    }
}
