package stage01.main;

import stage01.util.Box;

public class Task20_WrapperBox {
    public static void main(String[] args) {
        //| 20 | Generics | Напишите класс‑обёртку Box<T> с одним полем value, геттером и toString(). |
        printBoxT();
    }
    public static void  printBoxT() {
        Box<String> stringBox = new Box<>("Строка");
        System.out.println("BOX: " + stringBox);

        Box<Integer> integerBox = new Box<>(100);
        System.out.println("BOX: " + integerBox);

    }
}
