package SOLID.I;

public class Main {
    static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.prints();
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.fax();
        multiFunctionPrinter.scans();
        multiFunctionPrinter.prints();
    }
}
