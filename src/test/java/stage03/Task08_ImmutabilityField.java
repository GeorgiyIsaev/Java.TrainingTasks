package stage03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class Task08_ImmutabilityField {


    @Test
    void shouldCheckImmutabilityFieldX() throws NoSuchFieldException {
        Point point = new Point(0, 0);
        Class<Point> myClassClass = Point.class;
        Field fieldX = myClassClass.getDeclaredField("x");

        String tryException = "class stage03.Task08 cannot access a member of class stage03.Point with modifiers \"private final\"";
        String receivedException = "";
        String value = "";
        try {
            value = (String) fieldX.get(point);
        }
        catch (IllegalAccessException ex){
            receivedException = ex.getMessage();
        }
        Assertions.assertEquals(tryException, receivedException);
    }

    @Test
    void shouldCheckImmutabilityFieldY() throws NoSuchFieldException {
        Point point = new Point(0, 0);
        Class<Point> myClassClass = Point.class;
        Field fieldY = myClassClass.getDeclaredField("y");

        String tryException = "class stage03.Task08 cannot access a member of class stage03.Point with modifiers \"private final\"";
        String receivedException = "";
        String value = "";
        try {
            value = (String) fieldY.get(point);
        }
        catch (IllegalAccessException ex){
            receivedException = ex.getMessage();
        }
        Assertions.assertEquals(tryException, receivedException);
    }
}
