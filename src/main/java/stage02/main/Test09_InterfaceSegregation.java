package stage02.main;

import stage02.utilPrinter.IPrintable;
import stage02.utilPrinter.IScannable;
import stage02.utilPrinter.SimplePrinter;
import stage02.utilPrinter.SimpleScan;

public class Test09_InterfaceSegregation {
    //| 9 | Interface Segregation | Интерфейс SmartPrinter разделите на Printable (только print)
    // и Scannable (scan). Класс SimplePrinter реализует только Printable. |
    public static void main(String[] args) {
        testInterfaceSegregation();
    }
    public static void testInterfaceSegregation(){
        IScannable scan= new SimpleScan();
        String inConsoleText = scan.scan();

        IPrintable print = new SimplePrinter();
        print.println("Текст с консоли: " + inConsoleText);
    }

}
