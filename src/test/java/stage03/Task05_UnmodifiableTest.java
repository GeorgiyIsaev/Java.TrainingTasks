package stage03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stage03.main.Task05_Unmodifiable;

import java.util.ArrayList;
import java.util.List;

public class Task05_UnmodifiableTest {

    @Test
    public void testMain() {
        String[] args = {""};
        Task05_Unmodifiable.main(args);
    }

    @Test
    public void copyUnmodifiableTest(){
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        System.out.println("integers: " + integers);

        List<Integer> noModIntegers =  new Utils<Integer>().copyUnmodifiable(integers);

        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            noModIntegers.add(5);
        });
        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            noModIntegers.remove(0);
        });
    }

}
