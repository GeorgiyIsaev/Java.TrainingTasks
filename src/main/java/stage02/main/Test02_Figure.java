package stage02.main;

import stage02.figure.Figure;
import stage02.figure.ShapeFactory;

import java.util.ArrayList;
import java.util.List;

public class Test02_Figure {
    //| 2 | Статические фабрики | Создайте class ShapeFactory с static Figure ofSquare(double side)
    // и ofRectangle(w,h). Запретите new ShapeFactory() через private конструктор. |
    public static void main(String[] args) {
        testFigures();
    }
    public static void testFigures() {
        List<Figure> figures = new ArrayList<>();
        figures.add(ShapeFactory.ofRectangle(2, 4));
        figures.add(ShapeFactory.ofSquare(5));
        System.out.println(figures);
    }
}