package stage01.main;

import java.util.Map;

public class Task21_MapPrint {

    public static void main(String[] args) {
        //| 21 | Итерация | Выведите Map из п.19 тремя способами: по ключам, по значениям, по entrySet.
        printCollectionsHashMap();
    }

    public static void printCollectionsHashMap(){
        Map<String,Integer> products = Task19_Map.createMapProducts();

        System.out.println("Отображение MAP по ключам!");
        for(String name: products.keySet()){
            System.out.println(name + " - " + products.get(name) + " шт.");
        }
        System.out.println("Отображение MAP по значениям!");
        for(Integer qty: products.values()){
            System.out.println("Кол-во " + qty);
        }
        System.out.println("Отображение MAP по entrySet!");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + " : "+ entry.getValue() + " шт.");
        }
    }
}
