package stage01;

import stage01.figure.Figure;
import stage01.figure.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task29_RectangleTest {
//| 29 | JUnit (база) | Тест‑кейс RectangleTest.area() проверяет, что
// new Rectangle(3,4).area()==12. Используйте JUnit 5. |
    @Test
    public void area(){
        Figure figure = new Rectangle(3,4);
        double area = 12.0;

        Assertions.assertEquals(area, figure.area());
    }

}
