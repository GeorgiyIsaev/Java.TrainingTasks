package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage02.dataTask.Task;
import stage02.main.Test05_TaskEquals;
import stage02.main.Test07_TaskStatus;

public class Test05_TaskEqualsTest {

    //| 5 | equals / hashCode | Переопределите эти методы в Task(id,name),
    // чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. |
    @Test
    public void  TwoTasksWithTheSameIdShouldBeEqual(){
        Task task1 =  new Task(1, "Task1");
        Task task2 =  new Task(1, "Task2");
        Assertions.assertEquals(task1,task2);
    }

    @Test
    public void testMain() {
        Test05_TaskEquals.equalsTask();
    }
}
