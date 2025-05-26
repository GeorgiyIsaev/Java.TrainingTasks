package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage02.figure.Figure;
import stage02.figure.Rectangle;
import stage02.figure.ShapeFactory;
import stage02.figure.Square;
import stage02.main.Test02_Figure;
import stage02.main.Test07_TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class Test02_FigureTest {

    @Test
    public void testRectangle() {
        double sideA = 10.0;
        double sideB = 15.0;
        double area = 150.0;
        double perimeter = 50.0;
        //double perimeter = 64.0;
        // double area = 32.0;
        Figure figureFromFactory = ShapeFactory.ofRectangle(sideA, sideB);

        Assertions.assertEquals(area, figureFromFactory.area());
        Assertions.assertEquals(perimeter, figureFromFactory.perimeter());


    }

    @Test
    public void testSquare() {
        double sideSquare = 8.0;
        double area = 64.0;
        double perimeter = 32.0;
        Figure figureFromFactory = ShapeFactory.ofSquare(sideSquare);

        Assertions.assertEquals(area, figureFromFactory.area());
        Assertions.assertEquals(perimeter, figureFromFactory.perimeter());
    }

    @Test
    public void testMain() {
        Test02_Figure.testFigures();
    }


}
