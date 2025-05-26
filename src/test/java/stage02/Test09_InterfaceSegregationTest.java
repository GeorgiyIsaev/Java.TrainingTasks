package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage02.main.Test09_InterfaceSegregation;
import stage02.utilPrinter.IPrintable;
import stage02.utilPrinter.IScannable;
import stage02.utilPrinter.SimplePrinter;
import stage02.utilPrinter.SimpleScan;

import java.io.ByteArrayInputStream;

public class Test09_InterfaceSegregationTest {

    public void setUp(String command) {
        System.setIn(new ByteArrayInputStream(command.getBytes()));
    }

    @Test
    public void testMain() {
        setUp("consoleInput");
        Test09_InterfaceSegregation.testInterfaceSegregation();
    }

    @Test
    public void testScan() {
        String consoleInput = "consoleInput";
        setUp(consoleInput);
        IScannable scan = new SimpleScan();
        String inConsoleText = scan.scan();
        Assertions.assertEquals(consoleInput, inConsoleText);

        IPrintable print = new SimplePrinter();
        print.println("Текст с консоли: " + inConsoleText);
    }

}
