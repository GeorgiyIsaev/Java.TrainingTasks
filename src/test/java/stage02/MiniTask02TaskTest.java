package stage02;

import stage02.dataTask.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiniTask02TaskTest {
    //| 5 | equals / hashCode | Переопределите эти методы в Task(id,name),
    // чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. |
    @Test
    public void  TwoTasksWithTheSameIdShouldBeEqual(){
        Task task1 =  new Task(1, "Task1");
        Task task2 =  new Task(1, "Task2");
        Assertions.assertEquals(task1,task2);
    }
}
