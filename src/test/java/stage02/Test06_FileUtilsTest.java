package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage02.main.Test06_FileUtils;

import java.io.IOException;
import java.nio.file.Paths;

public class Test06_FileUtilsTest {

    @Test
    public void testNotFoundException(){
        Assertions.assertThrows(IOException.class, ()->{
            String text = "[ФАЙЛ НЕ НАЙДЕН!]";
            text = FileUtils.readText(Paths.get("Data\\testFile.txt_txt"));
            System.out.println(text);
        });
    }

    @Test
    public void testMain() {
        Test06_FileUtils.workFiles();
    }
}
