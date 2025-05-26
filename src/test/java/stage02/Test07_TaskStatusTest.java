package stage02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage02.dataTask.TaskStatus;
import stage02.main.Test07_TaskStatus;

public class Test07_TaskStatusTest {

    @Test
    public void testTaskStatusNEW(){
        TaskStatus status = TaskStatus.NEW;
        Assertions.assertTrue(TaskStatus.canStart(status));
    }
    @Test
    public void testTaskStatusIN_PROGRESS(){
        TaskStatus status = TaskStatus.IN_PROGRESS;
        Assertions.assertFalse(TaskStatus.canStart(status));
    }
    @Test
    public void testTaskStatusDONE(){
        TaskStatus status = TaskStatus.DONE;
        Assertions.assertFalse(TaskStatus.canStart(status));
    }
    @Test
    public void testTaskStatusBLOCK(){
        TaskStatus status = TaskStatus.BLOCKED;
        Assertions.assertFalse(TaskStatus.canStart(status));
    }

    @Test
    public void testMain() {
        Test07_TaskStatus.workTaskStatus();
    }

}
