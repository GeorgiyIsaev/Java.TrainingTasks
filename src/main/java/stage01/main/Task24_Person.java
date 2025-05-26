package stage01.main;

import stage01.Address;
import stage01.Person;

public class Task24_Person {
    //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
    public static void main(String[] args) {
        //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
        myPerson();
    }
    public static void myPerson(){
        Person person = new Person("Олег", new Address("Самолетная", 17));
        System.out.println("person: " + person);
    }


}
