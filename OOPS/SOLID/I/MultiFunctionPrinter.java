package SOLID.I;

public class MultiFunctionPrinter implements Printable, Scanable, Faxable{
    @Override
    public void prints() {
        System.out.println("MF prints");
    }

    @Override
    public void scans() {
        System.out.println("MF scans");
    }

    @Override
    public void fax() {
        System.out.println("MF fax's");
    }
}
